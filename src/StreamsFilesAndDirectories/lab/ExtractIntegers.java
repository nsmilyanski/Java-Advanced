package StreamsFilesAndDirectories.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("D:\\JavaText\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt");



        Scanner scanner = new Scanner(inputStream);

        PrintStream out = new PrintStream(outputStream);

        while (scanner.hasNext()){

            if (scanner.hasNextInt()){
                out.println(scanner.nextInt());
            }


            scanner.next();
        }

    }
}
