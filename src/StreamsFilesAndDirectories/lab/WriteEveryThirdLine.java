package StreamsFilesAndDirectories.lab;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("WriteEveryThirdLineOutput.txt");

        BufferedReader in = new BufferedReader(new FileReader(path));

       BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(outputStream));

        String line = in.readLine();

        int counter = 1;

        while (line != null){
            if (counter % 3 == 0){
                //System.out.printf("%s%n", line);
                bufferedWriter.write(line + System.lineSeparator());
            }
            line = in.readLine();
            counter++;
        }
        bufferedWriter.flush();
    }
}
