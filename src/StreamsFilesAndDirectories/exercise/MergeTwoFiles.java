package StreamsFilesAndDirectories.exercise;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");

        List<String> listOne = Files.readAllLines(path);

        Path path2 = Path.of("D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");

        PrintWriter printWriter = new PrintWriter("merge.txt");

        List<String> listTwo = Files.readAllLines(path2);

        List<String> listThree = new ArrayList<>();

        listOne.forEach(entry -> listThree.addAll(Arrays.asList(entry.split("\\s+"))));
        listTwo.forEach(entry -> listThree.addAll(Arrays.asList(entry.split("\\s+"))));


        listThree.forEach(line -> printWriter.write(String.format("%s%n", line)));

        printWriter.close();



    }
}
