package com.company;

/**
 * @author Arman Karapetyan
 */


public class Main {

    public static void main(String[] args) {

        MyMergeAndSort.sortWithMergeSortAlgorithm(new int[]{5, 15, 10, 25, 36, 18, 48, 45});
        System.out.println();
        MyMergeAndSort.sortWithMergeSortAlgorithm(new int[]{55, 5, 12, 10, 36, 10, 45, 47, 36, 10, 11, 48, 69});
        System.out.println();

        System.out.println(MyMergeAndSort.binarySearch(new int[]{5, 10, 10, 25, 36, 38, 48, 50}, 50));
        System.out.println();
        System.out.println(MyMergeAndSort.binarySearch(new int[]{5, 10, 10, 25, 36, 38, 48, 50}, 10));
        System.out.println();
        System.out.println(MyMergeAndSort.binarySearch(new int[]{5, 10, 10, 25, 36, 38, 48, 50}, 32));

    }
}
