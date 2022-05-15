package homework1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String s1 = sc.nextLine();
        if (s1.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }
    }
}
