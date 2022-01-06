package StreamsFilesAndDirectories.exercise;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String path = "D:\\JavaText\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter("countCharsTypes.txt"));


        String line = bufferedReader.readLine();

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        while (line != null){



            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                if (symbol != 32){
                    if (symbol == 'a' || symbol == 'o' || symbol == 'e' || symbol == 'i' || symbol == 'u'){
                        vowels++;
                    }else if (symbol == '!' || symbol == ',' || symbol == '.' || symbol == '?'){
                        punctuation++;
                    }else {
                        consonants++;
                    }
                }
            }


            line = bufferedReader.readLine();
        }
//        Vowels: 41
//        Consonants: 72
//        Punctuation: 6


        bufferedWriter.write(String.format("Vowels: %d%n", vowels));
        bufferedWriter.write(String.format("Consonants: %d%n", consonants));
        bufferedWriter.write(String.format("Punctuation: %d", punctuation));

        bufferedWriter.close();

        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(punctuation);
    }
}
