import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("What you want to multiply: ");
        Scanner scannerNum = new Scanner(System.in);
        int num = scannerNum.nextInt();
        int result = 0;
        for (int i = 1; i <=10 ; i++) {
            result = num * i;
            System.out.println(i + " * " + num + " = " + result );
        }
        // я предположила что вы имеете ввиду стандартную таблицу умножения(как в школе).
    }
}
