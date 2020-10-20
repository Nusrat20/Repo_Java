package Midterm;

import java.util.Arrays;

public class Test {

    /**
     * Question 1:
     * Create a method to return an int-array after removing a given int-value
     * from a given int array.
     *
     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     *
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     *
     *
     */

    public static int[] remove(int[] numbers, int inputNumber) {
        int count = 0;
        for (int number : numbers) {
            if (number == inputNumber) {
                count++;
            }
        }

        if (count == 0) {
            return numbers;
        }

        int[] result = new int[numbers.length - count];
        int index = 0;
        for (int value : numbers) {
            if (value != inputNumber) {
                result[index] = value;
                index++;
            }
        }
        numbers = null;
        return result;
    }


    public static void removeIntValue(){

        int[] inputArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int[] returnedArray = remove(inputArray, 24);
        System.out.println("input : " + Arrays.toString(inputArray) + ", remove 24");
        System.out.println("output : " + Arrays.toString(returnedArray));

        int[] inputArray2 = {1, 2, 4, 3, 1, 6, 1};
        int[] returnedArray2 = remove(inputArray2, 11);
        System.out.println("input : " + Arrays.toString(inputArray2) + ", remove 11");
        System.out.println("output : " + Arrays.toString(returnedArray2));

    }

    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0)
     * from given array.
     *
     * Example:
     * 	For array : {1, 3, 5, 4, 2, 7}
     * 	Method should return : 6
     *
     * 	For array : {-1, -3, 4, 2}
     * 	Method should return : 1
     *
     * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * 	Method should return : 4
     *
     */

    public static int findMissingNo(int []arr, int n) {
        int val;
        int nextval;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n)
                continue;
            val = arr[i];

            while (arr[val - 1] != val) {
                nextval = arr[val - 1];
                arr[val - 1] = val;
                val = nextval;
                if (val <= 0 || val > n)
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void findMissingSmallestPositiveInt ()
    {
        int arr[] = {0, 5, -1, 1, 2, 5, 3, 7, 1, 2 };
        int arr_size = arr.length;

        int missing = findMissingNo(arr, arr_size);

        System.out.println( "The smallest positive"
                + " missing number is: " + missing);
    }
    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points charged against
     * the license for over speeding.
     *
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user gets 12 points for a speed then license is suspended
     *
     *  Example:
     *      user speed = 74 ; 0 points
     *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     */




}
