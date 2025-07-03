package learning.codingQuestions;

public class OnlyDigits {
    public static void main(String[] args) {
        String inputStr = "545312";
        System.out.println("String contains only digits : "+ inputStr.matches("\\d+"));
    }
}
