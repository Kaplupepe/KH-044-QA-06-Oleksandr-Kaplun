package task2;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Double result = 0.0;
        Computing c = new Computing();
        System.out.println("Dude, please enter the number!");
        Double firstNum = c.getFirstNum();
        System.out.println("Choose the operation!");
        String operator = c.getOperator();
        System.out.println("The second number to enter!");
        Double secondNum = c.getSecondNum();
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