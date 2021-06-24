package miluo.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @className: CreatFile
 * @description:
 * @author: Miluo
 * @date: 2021/3/5
 **/
public class CreatFile {
    public static void main(String[] args) {
        try {
            writeDemo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * @Description File.createNewFile只能创建文件
     */
    public static void createNewFileDemo() throws IOException {
        String filePath = "D:\\PrivateSpace\\fileDemo1.txt";
        File file = new File(filePath);
        //true为创建成功，false为创建失败
        if (file.createNewFile()){
            System.out.println("文件创建成功");
        }else{
            System.out.println("文件创建失败");
        }
    }

    /*
     * @Description java7提供的可以创建文件，并向文件内写入数据。可以通过追加写模式，向文件内追加内容。
     */
    public static void writeDemo() throws IOException {
        String filePath = "D:\\PrivateSpace\\fileDemo2.txt";
        Path path = Paths.get(filePath);
        Files.write(path,"Hello World!! -创建文件".getBytes(StandardCharsets.UTF_8));

        //追加写
        Files.write(path,"Hello Miluo".getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND);
    }

    /*
     * @Description java8提供的newBufferedWriter可以创建文件，并向文件内写入数据。可以通过追加写模式，向文件内追加内容。
     */
    public static void newBufferedWriterDemo() throws IOException {
        String filePath = "D:\\PrivateSpace\\fileDemo3.txt";
        Path path = Paths.get(filePath);
        //try-with-resources语法,会自动关闭，不再需要finally来操作了。
        try (
            BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)
        ) {
            writer.write("Hello World -创建文件!!");
        }

        try(
            BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND)
        ){
            writer.write("Hello Miluo");
        }
    }
}
