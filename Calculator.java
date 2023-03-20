
public class Calculator {

    public double sum(double [] arr){
        //Creation of Array
        double sum_ = 0;
        for (double v : arr) {
            sum_ += v;}
        //adding all elements in an array
        System.out.println("Addition: "+sum_);
        return sum_;
    }

    public double subtract(double [] arr){
        //Creation of Array
        double diff_ = 0;
        for (double v : arr) {
            diff_ -= v;
        }
        //Subtracting all elements in an array
        System.out.println("Subtraction: "+diff_);
        return  diff_;
    }

    public  double Multiplication(double [] arr){
        //Creation of Array
        double pro_ = 1;
        for (double v : arr) {
            pro_ = pro_ * v;
        }
        //Multiplying all elements in an array
        System.out.println("product: " +pro_);
        return pro_;
    }

    public double divide(double a, double b){
        if(b == 0){
            // if denominator is zero return some random minimum value
            System.out.print("Cannot be divide by zero");
            return Double.MIN_VALUE;
        }
        double div_=a/b;
        System.out.println("division of Given Two Numbers is: "+div_);
        return  div_;
    }

    public double squareRoot(double radical){
        if(radical < 0){
            //if Given number is Negative then return some random minimum value
            System.out.println("Square Root of negative numbers cannot be real number\n");
            return Double.MIN_VALUE;
        }
        System.out.println("Square root: "+Math.sqrt(radical));
        return  Math.sqrt(radical);
    }
    public double moduloOfTwoNum(double a, double b) {
        // Handling negative values
        if (a < 0) {
            a = -1 * a;
        }
        if (b < 0) {
            b = -1 * b;
        }
        if (b == 0) {
            System.out.println("mod 0 is undefined ");
            return Double.MIN_VALUE;
        }
        double mod = a;
        while (mod >= b){
            mod -= b;
            //System.out.println("b & mod" + b + mod);
        }

        if (a > 0) {
            //System.out.println("a: " + a);
            System.out.println("mod: " + mod);
            return mod;
        }
        System.out.println("modulo of 2 numbers: " +mod);
        return mod;
    }
    public double Average(double [] arr){
        double sum_ = 0;
        int i =0;
        for(i =0; i < arr.length; i++){ sum_ += arr[i];}
        //calculating Average of all elements in an array
        double average = sum_ / (arr.length);
        System.out.println("Average of numbers: " +average);
        return average;
    }
    public int factorial(int n) {
        if (n < 0) {
            System.out.println("If the given integer is negative,n! is not defined\n");
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            int fact = n * factorial(n - 1);
            return fact;
        }
    }


}


