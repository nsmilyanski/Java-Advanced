package StreamsFilesAndDirectories.exercise;

import java.io.*;
import java.util.Scanner;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);



        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter("sumBytes.txt"));

        int oneByte = inputStream.read();

        int sum = 0;

        while (oneByte != -1){
            if (oneByte != 10 && oneByte != 13) {
                sum += oneByte;
            }
                oneByte = inputStream.read();
        }

        bufferedWriter.write(String.valueOf(sum));
        bufferedWriter.close();
    }
}
