package Week2;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please write a sentence: ");
        String userSent = sc.nextLine(); // Get input from user
        System.out.println(userSent.toUpperCase()); // Print out in UPPERCASE

        userSent.trim(); // Get rid of spaces at beginning and end
        String[] userSentSplit = userSent.split(" "); // Put each word into an array
        System.out.println("There are " + userSentSplit.length + " words in this sentence."); // Print the number of words

        // Reverse string solution is from w3schools. https://www.w3schools.com/java/java_howto_reverse_string.asp
        String userSentReverse = "";
        for (int i = 0; i < userSent.length(); i++) {
            userSentReverse = userSent.charAt(i) + userSentReverse; // This keeps adding the next character in front of what has gone beforehand, pushing it along.
        }
        System.out.println(userSentReverse);

        // Checks if sentence contains java or not. Will say it contains java even if java is a sequence in another word.
        if (userSent.toLowerCase().contains("java") ) {
            System.out.println("The sentence \"" + userSent + "\" contains the word java.");
        } else {
            System.out.println("The sentence \"" + userSent + "\" does not contain the word java.");
        }

        // Finding and replacing spaces with underscores
        System.out.println(userSent.replace(" ", "_"));
    }
}
