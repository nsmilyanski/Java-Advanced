package StreamsFilesAndDirectories.lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(fileInputStream);

        FileOutputStream outputStream = new FileOutputStream("out.txt");

        Set<Character> characterSet = Set.of(',', '.', '!', '?');

        int oneByte = fileInputStream.read();

        while (oneByte >= 0){
            char current = (char) oneByte;

            if (!characterSet.contains(current)){
                System.out.printf("%c", current);
                outputStream.write(current);
            }
            //System.out.printf("%s ", Integer.toBinaryString(oneByte));


            oneByte = fileInputStream.read();
        }
    }
}
