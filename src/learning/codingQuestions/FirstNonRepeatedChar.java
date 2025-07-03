package learning.codingQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "swiss";
        
        // Using LinkedHashMap to maintain insertion order
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        
        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Find first character with count 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: " + entry.getKey());
                return;
            }
        }
        
        System.out.println("No non-repeated character found");
    }
}
