import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner factorial = new Scanner(System.in);
        System.out.println("Введите любое положительное число: ");
        int f = factorial.nextInt();
        int result = 1;
        if (f <= 0 ){
            System.out.println("Вы ввели отрицательное число или 0.");
        }else {
        for (int i = 1; i<=f ; i++) {
            result = result * i ;
        }
        System.out.println("i = "+ result);
    }
    }
}