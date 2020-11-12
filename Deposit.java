import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        System.out.println("Your deposit will be : ");
        Scanner scannerSum = new Scanner(System.in);
        double depositSum = scannerSum.nextInt();
        System.out.println("Annual rate on deposit:");
        Scanner scannerAnnual = new Scanner(System.in);
        double annualPercent = scannerAnnual.nextDouble();
        System.out.println("Deposit term(years): ");
        Scanner scannerYears = new Scanner(System.in);
        double yearsOfDeposit = scannerYears.nextDouble();
        double depositYear= depositSum * annualPercent / 100;
        System.out.println("Accrual interest for the year "+ depositYear +"$");
        double totalSum = depositSum + (depositSum * annualPercent * yearsOfDeposit / 100);
        System.out.println("Total body and interest of your deposit is "+ totalSum + "$");






    }
}
