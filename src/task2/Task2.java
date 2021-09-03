package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Double firstNum;
        Double secondNum;
        Double result = 0.0;
        System.out.println("Dude, please enter the number!");
        firstNum = sc.nextDouble();
        System.out.println("Choose the operation!");
        String operator = sc1.nextLine();
        System.out.println("The second number to enter!");
        secondNum = sc2.nextDouble();
        if (operator.equals("+")) {
            result = firstNum + secondNum;
        } else if (operator.equals("-")) {
            result = firstNum - secondNum;
        } else if (operator.equals("*")) {
            result = firstNum * secondNum;
        } else if (operator.equals("/")) {
            result = firstNum / secondNum;
        } else if (operator.equals("%")) {
            result = firstNum % secondNum;
        }
        System.out.println("Result: " + result);
    }
}