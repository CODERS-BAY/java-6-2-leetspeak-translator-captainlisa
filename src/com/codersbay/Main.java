package com.codersbay;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a text in capital letters:");
        Scanner scan = new Scanner(System.in);

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] leetspeak = {'@', '8', '(', 'D', '3', 'F', '6', '#', '!', 'J', 'K', '1', 'M', 'N', '0', 'P', 'Q', 'R', '$', '7', 'U', 'V', 'W', 'X', 'Y', '2'};

        String message = scan.nextLine();
        char[] messageArray = message.toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < messageArray.length; j++) {
                if (messageArray[j] == alphabet[i]) {
                    messageArray[j] = leetspeak[i];
                }
            }
        }

        System.out.println(messageArray);

    }
}
