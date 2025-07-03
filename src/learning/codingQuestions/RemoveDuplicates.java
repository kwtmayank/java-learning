package learning.codingQuestions;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String inputStr = "Hellloooaaaa";
        StringBuilder newStr = new StringBuilder();
        inputStr.chars().distinct().forEach(c -> newStr.append((char) c));
        System.out.println(newStr);
    }
}
