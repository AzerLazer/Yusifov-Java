package homework1;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        if (a > 7) {
            System.out.println("Привет");
        }
    }
}
