package learning.codingQuestions;

import java.util.Scanner;

public class ValidatePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String inputStr = scanner.nextLine();

//        if(inputStr.equals(new StringBuilder(inputStr).reverse().toString())) {
//            System.out.println(inputStr + " is a palindrome");
//        } else {
//            System.out.println(inputStr + " is not a palindrome");
//        }

        int start = 0;
        int end = inputStr.length() - 1;
        while(start < end) {
            if(inputStr.charAt(start) != inputStr.charAt(end)) {
                System.out.println(inputStr + " is not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println(inputStr + " is a palindrome");
    }
}
