//package test;
//
//
//import org.apache.catalina.webresources.FileResource;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.batch.core.partition.support.Partitioner;
//import org.springframework.batch.item.ExecutionContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.FileSystemResource;
//
//import java.io.*;
//import java.nio.channels.FileChannel;
//import java.util.HashMap;
//import java.util.Map;
//
//public class PartFile implements Partitioner {
//    private static final Logger log = LoggerFactory.getLogger(PartFile.class);
//    private static final String NEW_FILE_PATH="D:\\newFile.txt";
//    @Autowired
//    FileSystemResource fileSystemResource;
//    public static final int  PART_SIZE=10;
//    @Override
//    public Map<String, ExecutionContext> partition(int gridSize) {
//        log.info("开始切割大文件");
//        HashMap<String, ExecutionContext> map = new HashMap<>();
//        try {
//            FileChannel inChannel = new FileInputStream(fileSystemResource.getFile()).getChannel();
//            Long size=inChannel.size(); //统计行数
//            int records = (int) (size / PART_SIZE);       // 10 为每行数据大小，这里计算总行数
//            int parttionSize = (int) (records*1.0 / gridSize + 0.9999999);   // 计算每个分片的记录数 +1 是为了防止分片过小。 后续分片实际上根据parttionSize来进行分片
//            log.info("文件长度为:[{}],每行大小为:{[]},当前行数为[{}]",size,records,parttionSize);
//            //拆分文件
//            File file = new File(fileSystemResource.getFile().getParent() + File.separator + fileSystemResource.getFilename() + ".parttions");
//            if (file.exists()){
//            log.info("临时文件存在，删除后再创建一个新的");
//            file.delete();
//            }
//            file.mkdir();
//            for (int i = 1,restLines=records;restLines>0 ; i++,restLines-=parttionSize) {
//                int skip=(i-1) *parttionSize;//分片的起始位置，第一个分页在0，第二个分页在11，第三个在21...
//                ExecutionContext executionContext= new ExecutionContext();
//                executionContext.putString("partFilePath",file.getAbsolutePath() + File.separator + fileSystemResource.getFilename() + "_" + i );
//                executionContext.putInt("skip", skip);//切分的位置
//                executionContext.putInt("parttionSize", parttionSize);//大小
//                executionContext.putInt("partIndex",i);//第几个部分
//                map.put("part"+i, executionContext);//放入每个部分的编号，和元素
//                //拆分开始,将文件进行十等分成10个的文件
//                File splitFile =  new File(file.getAbsolutePath() + File.separator + fileSystemResource.getFilename() + "_" + i );
//                if (splitFile.exists()){
//                    splitFile.delete();
//                }
//                file.createNewFile();
//                FileChannel splitFileOutchannel = null;
//
//                try{
//                    // 输出拆分文件内容
//                    splitFileOutchannel = new FileOutputStream(splitFile).getChannel();
//                    inChannel.transferTo(skip * PART_SIZE, parttionSize * PART_SIZE, splitFileOutchannel);
//                    log.info("output to splitfile:[{}]", splitFile.getName());
//                    splitFileOutchannel.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }finally {
//                    if(null != splitFileOutchannel) splitFileOutchannel.close();
//                }
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return map;
//    }
//
//
//    }
//
