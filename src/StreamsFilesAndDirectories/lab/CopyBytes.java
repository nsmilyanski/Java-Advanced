package StreamsFilesAndDirectories.lab;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("out.txt");

        PrintStream out = new PrintStream(outputStream);

        int oneByte = inputStream.read();

        while (oneByte >= 0){
            char symbol = (char) oneByte;

            if (symbol != 32 && symbol != 10){
                out.print((int)symbol);
            }else if (symbol == 10){
                out.println();
            }else {
                out.print(" ");
            }


            oneByte = inputStream.read();
        }


    }
}
