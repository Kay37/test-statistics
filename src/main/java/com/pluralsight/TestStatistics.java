package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {

        // * created an integer array with 10 random test scores
    int[] testScores = {25, 56, 43, 98, 77, 37, 89, 90, 90, 100};
        // * find high score from the array

        // ! we're going to use the Stream API for these calculations.
        // ! we import the java.util.Arrays library and put our Array into the stream, so that as it
        // ! "floats" down and collides with each description / method, it puts it all together
        // ! at the final method that you terminate with a ;
    int highScore = Arrays.stream(testScores)
            .max()
            .getAsInt();
        System.out.println("The highest score from the testScores array is: " + highScore);
        // * find low score from the array
    int lowScore = Arrays.stream(testScores)
            .min()
            .getAsInt();
        System.out.println("The lowest score from the testScores array is: " + lowScore);
        // * find average score from the array
        double averageScore = Arrays.stream(testScores)
                .average()
                .getAsDouble();
        System.out.println("The average score from the testScores array is: " + averageScore);

    } // ! main method cBracket

} // ! main class cBracket
