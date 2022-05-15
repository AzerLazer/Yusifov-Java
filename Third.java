package homework1;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите числа через пробел: ");
        String checkStr = in.nextLine();
        String strArr[] = checkStr.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].matches("[-+]?\\d+")){
                if(Integer.parseInt(strArr[i])%3==0){
                    System.out.println(strArr[i]);
                }
            }
        }
    }
}
