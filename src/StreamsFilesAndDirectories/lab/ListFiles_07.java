package StreamsFilesAndDirectories.lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ListFiles_07 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path path = Path.of("D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File folder = new File(String.valueOf(path));

        File [] filesArr = folder.listFiles(File::isFile);

        Writer writer = new PrintWriter("sizeFiles.txt");

        for (File file: filesArr) {
           // System.out.printf("%s: [%d]%n", file.getName(), file.length());
            writer.write(String.format("%s: [%d]%n", file.getName(), file.length()));
        }
        writer.close();
    }
}
