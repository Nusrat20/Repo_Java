package Class9;

public class HomeWork7 {
    /**
     * 1. Create a method to add all the numbers in a array with double-values
     * 2. Create a method to verify if the input-int-number is prime or not
     * prime number: number divisible by 1 and itself
     * eg: 7 -> prime
     * 21 -> not a prime
     *
     c
     * 4. Write a method to print(no return) the duplicate values in a given String array.
     * Input String array -> {"hello", "peace", "happy" , "hello", "Happy", "hello"}
     * Method should print -> hello, happy
     * hello
     * happy
     *
     * 5. Write a method to print(no return) the common values between two arrays (string arrays)
     * Input arrays:
     *  arr1 -> {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"}
     *  arr2 -> {"hello", "grow", "laugh" , "peace"}
     * Method should print -> hello, peace, laugh
     * hello
     * peace
     * laugh
     *
     */

    //1. Create a method to add all the numbers in a array with double-values
        public double addNumbers(double num1, double num2, double num3) {
            double[] array = {num1, num2, num3};
            double sum = 0;
            for (double num : array) {
                sum = sum + num;
            }
            return sum;
        }

     //* 2. Create a method to verify if the input-int-number is prime or not
    //     * prime number: number divisible by 1 and itself
    //     * eg: 7 -> prime
    //     * 21 -> not a prime

     public boolean isPrime( int n) {
         if (n < 1) return false;
         for (int i = 2; i < n; i++)
             if (n % i == 0)
                 return false;
         return true;
     }

     //* 3. Create a method to find if given string is palindrome.
    //     * Palindrome: string which reads the same in reverse.
    //     * racecar  ->  racecar
    //     * level    ->  level
//    public  boolean  isPlaindromeString(String text) {
//        String reverse = text;
//        if (text.equals(reverse)){
//            return true;
//        }
//        return false;}
//
//    }

    /**public static String  isPlaindrome(String input){
    if (input = null;
    return input{
        return input.charAt(input.length()-1)
            (input.substring(0))
        }
    }**/
    public boolean isPlaindrome(String input) {

        char [] text = input.toCharArray();
        int i = 0;
        int j = text.length - 1;
        while (j > i) {
            if (text[i] != text[j]) {
                return false;
            }
            ++i;
            --j;
        }
        return true;


    }

                
    
}
    



    //public static String  isPlaindrome(String input){















