

import java.util.Scanner;

public class home {

    public static void main(String[] args) {
        {
            long d = 1, result = 0, number2;
            long number;

            System.out.println("Enter number");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextLong();
            number2 = number;
            char end;
            if ((number2 >= Byte.MIN_VALUE) && (number2 <= Byte.MAX_VALUE)) System.out.println("It can be byte type");
            if ((number2 >= Short.MIN_VALUE) && (number2 <= Short.MAX_VALUE)) System.out.println("It can be short type");
            if ((number2 >= Integer.MIN_VALUE) && (number2 <= Integer.MAX_VALUE)) System.out.println("It can be integer type");
            if ((number2 >= Long.MIN_VALUE) && (number2 <= Long.MAX_VALUE)) System.out.println("It can be long type");


            while (number >= 1) {
                if (number % 2 != 0) result = result + d;
                d = d * 10;
                number /= 2;
            }
            System.out.println("result:= " + result);
        }
    }
}