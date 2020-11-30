import java.lang.reflect.Array;


public class ArithmetricMean2 {
    public static void main(String[] args) {
        double [] numbers = {2,3,3};
        double result = 0;
        for (double num :numbers ) {
            result += num;
        }
        System.out.println("Arithmetric mean is:  " +result /numbers.length);

        }




    }

