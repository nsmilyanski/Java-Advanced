package StreamsFilesAndDirectories.exercise;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Exercises-Resources//inputLineNumbers.txt");

        PrintWriter printWriter = new PrintWriter("lineNumbers.txt");
        List<String> lines = Files.readAllLines(path);

        List<String> list = new ArrayList<>();

        int counter = 1;

        for (String line: lines) {
            String currentLine = counter + ". " + line;
            list.add(currentLine);
            counter++;
        }

        list.forEach(printWriter::println);

        printWriter.close();

    }
}
