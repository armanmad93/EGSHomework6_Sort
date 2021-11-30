package com.company;

/**
 * @author Arman Karapetyan
 */

import java.util.Arrays;

public class MyMergeAndSort {

    public static void sortWithMergeSortAlgorithm(int[] sourceArray) {

        if (sourceArray == null) {
            System.exit(-1);
        }

        if (sourceArray.length >= 2) {

            int[] sourceArrayLeft = new int[sourceArray.length / 2];
            System.arraycopy(sourceArray, 0, sourceArrayLeft, 0, sourceArray.length / 2);

            int[] sourceArrayRight;

            if (sourceArray.length % 2 != 0) {
                sourceArrayRight = new int[(sourceArray.length / 2) + 1];
            } else {
                sourceArrayRight = new int[sourceArray.length / 2];
            }

            System.arraycopy(sourceArray, sourceArrayLeft.length, sourceArrayRight, 0, sourceArray.length - sourceArrayLeft.length);

            sortWithMergeSortAlgorithm(sourceArrayLeft);
            sortWithMergeSortAlgorithm(sourceArrayRight);

            int positionLeft = 0;
            int positionRight = 0;

            for (int i = 0; i < sourceArray.length; i++) {
                if (positionLeft == sourceArrayLeft.length) {
                    sourceArray[i] = sourceArrayRight[positionRight];
                    positionRight++;
                } else if (positionRight == sourceArrayRight.length) {
                    sourceArray[i] = sourceArrayLeft[positionLeft];
                    positionLeft++;
                } else if (sourceArrayLeft[positionLeft] < sourceArrayRight[positionRight]) {
                    sourceArray[i] = sourceArrayLeft[positionLeft];
                    positionLeft++;
                } else {
                    sourceArray[i] = sourceArrayRight[positionRight];
                    positionRight++;
                }
            }
        }

        //for chack
        System.out.println(Arrays.toString(sourceArray));

    }
    
    public static int binarySearch(final int[] input, final int target) {

        int firstElement = 0;
        int lastElement = input.length - 1;
        int middleElement = (firstElement + lastElement) / 2;

        while (firstElement <= lastElement) {

            if (input[middleElement] < target) {
                firstElement = middleElement + 1;
            } else if (input[middleElement] == target) {
                return middleElement;
            } else {
                lastElement = middleElement - 1;
            }
            middleElement = (firstElement + lastElement) / 2;

        }

        return -1;
    }

}
