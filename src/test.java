import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String linr = "On January 1 , 1533 , \n" +
                "Michael Angelo, \n" +
                "then fifty-seven years old, \n" +
                "writes\n" +
                "from Florence to \n" +
                "Tommaso de' Cavalieri, \n" +
                "a youth of noble Roman family,\n";

        String[] inputArr = linr.split("\\n");

        for (String line: inputArr) {
            int sum = 0;

            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                if (symbol != 32 ) {
                    sum += symbol;
                }
            }
            System.out.println(sum);
        }
        System.out.println();
    }
}
