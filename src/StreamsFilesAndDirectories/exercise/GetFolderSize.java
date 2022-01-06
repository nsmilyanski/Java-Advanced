package StreamsFilesAndDirectories.exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class GetFolderSize {
    public static void main(String[] args) throws IOException {


        Path path = Path.of("D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");

        File floder = new File(String.valueOf(path));


        File[] files = floder.listFiles();

        int size = 0;
        long length = 0;
        for (File file: files) {
            length += file.getAbsoluteFile().length();
        }

        System.out.println("Folder size: " + length);
    }
}
