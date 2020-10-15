package Class9;

public class MathLibraryCw {

    public int addTwo(int num1, int num2) {
        return num1 + num2;
    }

    //or
    // int result = num1+num2;
    //return = result
    public int subTwo(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplyTwo(int num1, int num2) {
        return num1 * num2;
    }

    public double dividetwo(double num1, int num2) {
        double result = 0.00;
        if (num2 != 0) {
            result = num1 / num2;
        }
        return result;
    }

}
