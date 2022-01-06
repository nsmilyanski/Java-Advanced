package StreamsFilesAndDirectories.exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");

        Path path1 = Path.of("D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");

        PrintWriter printWriter = new PrintWriter("wordCount.txt");

        List<String> stringList = Files.readAllLines(path);

        List<String> listOfWords = Files.readAllLines(path1);

        Map<String, Integer> valueMap = new LinkedHashMap<>();

        listOfWords.forEach(entry -> Arrays.stream(entry.split(" "))
                .forEach(e -> valueMap.put(e, 0)));

        for (String line : stringList) {
            String currentLine = line.replaceAll("[\\.\\,]", "");
            String[] array = currentLine.split("\\s+");

            for (String word: array) {
                if (valueMap.containsKey(word)){
                    valueMap.put(word, valueMap.get(word) + 1);
                }
            }


        }

            valueMap.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(entry -> printWriter.write(String.format("%s - %d%n", entry.getKey(), entry.getValue())));

        printWriter.close();
    }
}
