package LabS1;

public class ClassWork {

    //write a method to return the count of vowels in the given string
    //"have a graet day ahead"

    public  double testInt (double[] arr){
        double sum = 0;
        for (int i = 0 ; i <= arr.length ; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
           // ADD TWO NUMBERS
    public static  int addTwoNumbers( int num1, int num2) {
    int result = num1 + num2;
    return result ;

    }
           //DIVIDE NUMBERS
    public static double divideNums( int num1, double num2) {
        double result = 0;
        if(num2!= 0){
         result = num1 / num2;
    }

             return result;
    }
    }
