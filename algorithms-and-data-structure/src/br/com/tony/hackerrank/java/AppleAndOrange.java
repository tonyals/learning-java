package br.com.tony.hackerrank.java;

import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true">Challenge link</a>
 * */
public class AppleAndOrange {
    public static void main(String[] args) {
        List<Integer> apples = Arrays.asList(-2, 2, 1);
        List<Integer> oranges = Arrays.asList(5, -6);
        int s = 7;  // starting point of sam's house location
        int t = 11;  // ending point of sam's house location
        int a = 5;  // location of apple tree
        int b = 15;  // location of orange tree
        countApplesAndOranges(s, t, a, b, apples, oranges);

    }

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s: integer, starting point of Sam's house location.
     *  2. INTEGER t: integer, ending location of Sam's house location.
     *  3. INTEGER a: integer, location of the Apple tree.
     *  4. INTEGER b: integer, location of the Orange tree.
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        long countApple = apples.stream()
                .map(apple -> a + apple)
                .filter(apple -> apple >= s && apple <= t)
                .count();

        long countOrange = oranges.stream()
                .map(orange -> b + orange)
                .filter(orange -> orange >= s && orange <= t)
                .count();
        System.out.println(countApple);
        System.out.println(countOrange);
    }
}
