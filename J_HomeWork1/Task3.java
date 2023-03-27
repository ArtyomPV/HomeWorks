package J_HomeWork1;

import java.util.Scanner;

public class Task3 {
    char action;
    double number1;
    double number2;

    Task3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите действие (+, -, *, /): ");
        action = sc.nextLine().charAt(0);
        System.out.print("Введите первое число: ");
        number1 = sc.nextDouble();
        System.out.print("Введите второе число: ");
        number2 = sc.nextDouble();
//        double result = Operations(action, number1, number2);
//        System.out.printf("%f ", result);
    }


    public void Operations() {

        if (action == '+') {
            System.out.printf("%.2f %c %.2f = %.2f", number1, action, number2, number1 + number2);

        } else if (action == '-') {
            System.out.printf("%.2f %c %.2f = %.2f", number1, action, number2, number1 - number2);
        } else if (action == '*') {
            System.out.printf("%.2f %c %.2f = %.2f", number1, action, number2, number1 * number2);
        } else if (action == '/') {
            if (number2 != 0) {
                System.out.printf("%.2f %c %.2f = %.2f", number1, action, number2, number1 / number2);
            } else {
                System.out.printf("На ноль делить нельзя");
            }

        } else {
            System.out.printf("Действие не распознано.");
        }
    }
}

