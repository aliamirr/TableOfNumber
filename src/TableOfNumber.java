import java.util.Scanner;

public class TableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number till which you want the sum.");
        int n = sc.nextInt();
        System.out.println("The table of " + n + " is: ");
        for(int i = 1; i <= 10; i++) {
            int table = i * n;
            System.out.println(n + " * " + i + " = "+ table);
        }
    }
}