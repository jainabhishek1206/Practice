package com.others;

public class SecondLargestElementInArray {
    static void main() {
        System.out.println(secondLargestElementInArray(new int[] {1,2,3,4,5}));
        System.out.println(secondLargestElementInArray(new int[] {2,2,2,2,2,2}));
        System.out.println(secondLargestElementInArray(new int[] {3}));
        System.out.println(secondLargestElementInArray(new int[] {23,234,434,2,4,5}));

        System.out.println("=========================");

        System.out.println(optimalSolution(new int[] {1,2,3,4,5}));
        System.out.println(optimalSolution(new int[] {2,2,2,2,2,2}));
        System.out.println(optimalSolution(new int[] {3}));
        System.out.println(optimalSolution(new int[] {23,234,434,2,4,5}));
    }

    private static int optimalSolution(int[] array) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++) {
            if(array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if(array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    private static int secondLargestElementInArray(int[] arr) {
        int max = findMax(arr);
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > ans && arr[i] < max ) {
                ans = arr[i];
            }
        }
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }

    private static int findMax(int[] arr) {
        int ans = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > ans) ans = arr[i];
        }
        return ans;
    }



    /*Test Cases
    * 1     2   3   4   5
    * 2     3   3   2   4
    * 2     2   2   2   2
    * */

}
