package br.com.tony.hackerrank.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true">Challenge Link</a>
 * HackerLand University has the following grading policy:
 * */
public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        List<Integer> integers = gradingStudents(grades);
        System.out.println(integers);
    }

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (Integer grade : grades) {
            int diff = Math.abs(grade % 5 - 5);
            if (grade < 38 || diff > 2) {
                roundedGrades.add(grade);
                continue;
            }
            roundedGrades.add(grade + diff);
        }
        return roundedGrades;
    }
}








