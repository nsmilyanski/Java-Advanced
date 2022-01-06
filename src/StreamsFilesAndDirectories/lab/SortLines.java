package StreamsFilesAndDirectories.lab;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

        List<String> sortedList = Files.readAllLines(path)
                .stream().sorted().collect(Collectors.toList());



        BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of("out.txt"));


      Files.write(Paths.get("out.txt"), sortedList);



    }
}
