package Week6.JUnitExamples;

import java.util.Scanner;
// test driven development example

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the password tester.\nPlease enter your password:\t");
        String password = sc.next();
        ValidatePassword.isValidLowercase(password);
        //testPasswordLength(password);

    }
}
