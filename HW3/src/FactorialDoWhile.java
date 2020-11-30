import java.util.Scanner;

public class FactorialDoWhile {
    public static void main(String[] args) {
        {
            Scanner factorial = new Scanner(System.in);
            System.out.println("Введите любое положительное число: ");
            int f = factorial.nextInt();
            int result = 1;
            int i = 1;
            do {
                result *= i;
                i++;
            }while (i <= f);
            System.out.println("i = " + result);
        }
    }
}
