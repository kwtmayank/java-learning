package learning.codingQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String inputStr = scanner.nextLine();
        System.out.println("Enter character: ");
        char inputChar = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == inputChar) {
                count++;
            }
        }
        System.out.println("The character " + inputChar + " occurs " + count + " times in the string " + inputStr);

        Map<Character, Integer> map = new HashMap<>();
        inputStr.chars().forEach(c ->
                map.put((char) c, map.getOrDefault((char) c, 0) + 1));
        System.out.println(map);
    }
}
