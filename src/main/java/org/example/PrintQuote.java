package org.example;
import java.util.Scanner;

public class PrintQuote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String who = input.nextLine();
        String outputString = (who + " says, \"" + quote + "\"");

        System.out.println(outputString);
    }
}
