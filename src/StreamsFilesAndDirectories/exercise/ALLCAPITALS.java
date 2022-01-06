package StreamsFilesAndDirectories.exercise;

import java.io.*;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        String path = "D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter("allCapital.txt"));

        String line = bufferedReader.readLine();

        while (line != null){
            line = line.toUpperCase();
            bufferedWriter.write(line + System.lineSeparator());

            line = bufferedReader.readLine();
        }
        bufferedWriter.close();
    }
}
