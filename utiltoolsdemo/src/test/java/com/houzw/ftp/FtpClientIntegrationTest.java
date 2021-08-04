package com.houzw.ftp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockftpserver.fake.FakeFtpServer;
import org.mockftpserver.fake.UserAccount;
import org.mockftpserver.fake.filesystem.DirectoryEntry;
import org.mockftpserver.fake.filesystem.FileEntry;
import org.mockftpserver.fake.filesystem.FileSystem;
import org.mockftpserver.fake.filesystem.UnixFakeFileSystem;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class FtpClientIntegrationTest {

    private FakeFtpServer fakeFtpServer;

    private FtpClient ftpClient;

    @Before
    public void setup() throws IOException {
        fakeFtpServer = new FakeFtpServer();
        fakeFtpServer.addUserAccount(new UserAccount("hzw", "hzw123", "/data"));

        FileSystem fileSystem = new UnixFakeFileSystem();
        fileSystem.add(new DirectoryEntry("/data"));
        fileSystem.add(new FileEntry("/data/foobar.txt", "abcdef 1234567890"));
        fileSystem.add(new FileEntry("/data/buz.txt", "abcdef 1234567890"));
        fakeFtpServer.setFileSystem(fileSystem);
        fakeFtpServer.setServerControlPort(0);

        fakeFtpServer.start();

        System.out.println("ServerControlPort:" + fakeFtpServer.getServerControlPort());

        ftpClient = new FtpClient("localhost", fakeFtpServer.getServerControlPort(), "hzw", "hzw123");
        ftpClient.open();
    }

    @After
    public void teardown() throws IOException {
        ftpClient.close();
        fakeFtpServer.stop();
    }

    @Test
    public void ftpServerHold(){
        try {
            Thread.sleep(60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenRemoteFile_whenListingRemoteFiles_thenItIsContainedInList() throws IOException {

        System.out.println("hehehe");
        Collection<String> files = ftpClient.listFiles("");
        files.stream().forEach(name -> {System.out.println(name);});
        assert(files.contains("foobar.txt"));
//        assertThat(files).contains("foobar.txt");
    }


    @Test
    public void givenRemoteFile_whenDownloading_thenItIsOnTheLocalFilesystem() throws IOException {
        ftpClient.downloadFile("/data/buz.txt", "downloaded_buz.txt");
        assert(new File("downloaded_buz.txt").exists());
        new File("downloaded_buz.txt").delete(); // cleanup
    }


    @Test
    public void givenLocalFile_whenUploadingIt_thenItExistsOnRemoteLocation()
            throws URISyntaxException, IOException {

        File file = new File(getClass().getClassLoader().getResource("baz.txt").toURI());
        ftpClient.putFileToPath(file, "/buz.txt");
        assert(fakeFtpServer.getFileSystem().exists("/buz.txt"));
//        assertThat(fakeFtpServer.getFileSystem().exists("/buz.txt")).isTrue();
    }




}