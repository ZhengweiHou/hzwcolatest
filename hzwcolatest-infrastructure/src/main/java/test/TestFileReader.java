package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class TestFileReader {
    final static String FILE_PATH="D:\\test.txt";
    public static void main(String[] args) throws IOException {
        useFileLines();//jdk1.8的迭代器读取但是随机/迭代器读取不随机/并行流读取，目前最快,适合大型文件
        useFileLinesToList();//jdk1.8转换成list读取，但是可能出现OOM错误
        useFileLinesToBytesToString();//1.7先转换成byte再转换成字符串进行处理,无法获取行
        useFileLinesChannel();//1.7使用管道流
    }

    private static void useFileLinesChannel() throws IOException {
        //       使用管道流
        BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
        AtomicInteger lineNum= new AtomicInteger();
        String line;
        while((line=br.readLine())!=null){
            lineNum.getAndIncrement();
            if (line.contains("error")) {
                System.out.println("出错的行数为:" + lineNum + "，内容为：" + line);
            }
        }
    }


    private static void useFileLinesToBytesToString() throws IOException {
//       1、转bytes再转String但这种方法无法取到行数

//        byte[] bytes = Files.readAllBytes(Paths.get(FILE_PATH));
//        String content = new String(bytes, StandardCharsets.UTF_8);
//        System.out.println("1.7的方法，先转换成byte再转换成string然后读取,但这种方法无法取到行数");

    }

    private static void useFileLinesToList() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(FILE_PATH),
                StandardCharsets.UTF_8);
        AtomicInteger lineNum= new AtomicInteger();
        lines.forEach(
                line-> {
                    lineNum.getAndIncrement();
                    if (line.contains("error")) {
                        System.out.println("出错的行数为:" + lineNum + "，内容为：" + line);
                    }
                }
        );
    }

    public static void  useFileLines() throws IOException {
        Stream<String> lines = Files.lines(Paths.get(FILE_PATH));
        AtomicInteger lineNum= new AtomicInteger();
        long star = System.currentTimeMillis();
//        1、迭代器读取，读取随机，行数可能是乱的，但是速度快
//        lines.forEach(
//                line-> {
//                         lineNum.getAndIncrement();
//                         if (line.contains("error")){
//                         System.out.println("出错的行数为:"+lineNum+"，内容为："+line);
//        }
//                    }
//        );
//        2、使用forEachOrdered获取，按顺序读取，但是执行速度变慢
//        lines.forEachOrdered(
//                line->{
//                    lineNum.getAndIncrement();
//                    if (line.contains("error")){
//                        System.out.println("出错的行数为:"+lineNum+"，内容为："+line);
//                    }
//                }
//        );
//          3、java并行流读取文件，使用了fork join速度非常快
//            lines.parallel().forEachOrdered(
//                    line->{
//                    lineNum.getAndIncrement();
//                    if (line.contains("error")){
//                        System.out.println("出错的行数为:"+lineNum+"，内容为："+line);
//                    }
//                }
//            );
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为:"+(end-star));
    }
}
