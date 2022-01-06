package StreamsFilesAndDirectories.lab;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ListFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get("D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File file = path.toFile();

        Deque<File> queue = new ArrayDeque<>();

        queue.offer(file);

        int counter = 0;


        while (!queue.isEmpty()){
            counter++;
            File file1 = queue.poll();
            System.out.println(file1.getName());
            File[] files = file1.listFiles();

            if (files != null){
                for (File f: files) {
                    if (f.isDirectory()){
                        queue.offer(f);
                    }
//                    else {
//                        System.out.println(f.getName());
//                    }

                }
            }
        }
        System.out.println(counter + " folders");
    }
}
