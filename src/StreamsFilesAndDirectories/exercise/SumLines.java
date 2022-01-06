package StreamsFilesAndDirectories.exercise;

import java.io.*;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter("sumLines.txt"));

        String line = bufferedReader.readLine();

        while (line != null){

            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                if (symbol != 13 && symbol != 10) {
                    sum += symbol;
                }
            }
            //System.out.println(sum);
            bufferedWriter.write(sum + System.lineSeparator());
            line = bufferedReader.readLine();
        }
        bufferedWriter.close();
    }
}
