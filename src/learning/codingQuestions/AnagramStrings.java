package learning.codingQuestions;

import java.util.Arrays;
import java.util.function.BiFunction;

public class AnagramStrings {
    public static void main(String[] args) {
        String firstStr = "dormitory";
        String secondStr = "dirty room";

        firstStr = Arrays.stream(firstStr.split(" ")).reduce(String::concat).get();
        secondStr = Arrays.stream(secondStr.split(" ")).reduce(String::concat).get();

        char[] arr1 = firstStr.toCharArray();
        char[] arr2 = secondStr.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));
    }
}
