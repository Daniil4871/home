

import java.util.Scanner;

public class home {

    public static void main(String[] args) {
        {
            long d = 1, result = 0, number2;
            int number;

            System.out.println("Enter number");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            number2 = number;
            char end;
            if ((number2 >= -128) && (number2 <= 127)) System.out.println("It's byte type");
            if ((number2 >= -32768) && (number2 <= 32767)) System.out.println("It's short type");
            if ((number2 >= -2147483648) && (number2 <= 2147483647)) System.out.println("It's integer type");
             System.out.println("It's long type");


            while (number >= 1) {
                if (number % 2 != 0) result = result + (d);
                d = d * 10;
                number /= 2;
            }
            System.out.println("result:= " + result);
        }
    }
}