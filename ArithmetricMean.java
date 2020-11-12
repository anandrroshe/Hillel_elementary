import java.util.Scanner;

public class ArithmetricMean {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner scannerNumber1= new Scanner(System.in);
        double number1 = scannerNumber1.nextDouble();
        System.out.println("Enter second number: ");
        Scanner scannerNumber2= new Scanner(System.in);
        double number2 = scannerNumber2.nextDouble();
        double arMean = (number1+number2) / 2 ;
        System.out.println("Your arithmetric mean is  - "+ arMean);


    }
}
