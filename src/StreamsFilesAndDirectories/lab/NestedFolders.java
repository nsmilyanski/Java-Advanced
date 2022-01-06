package StreamsFilesAndDirectories.lab;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class NestedFolders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathStr = "D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File folder = new File(pathStr);

        File[] filesArr = folder.listFiles();

        for (File file: filesArr) {
            if (file.isDirectory()){
                System.out.println(file.getName());
                File[] floders = file.listFiles();
                Arrays.stream(floders).forEach(fl -> {
                    if (fl.isDirectory()){
                        System.out.println(fl.getName());
                    }
                });
            }
        }
    }
}
