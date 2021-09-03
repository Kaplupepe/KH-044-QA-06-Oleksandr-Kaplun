package task2;

import java.util.Scanner;

public class Computing {
    Scanner sc = new Scanner(System.in);
    Scanner operatorScanner = new Scanner(System.in);
    Double firstNum;
    Double secondNum;
    String operator;

    public Double getFirstNum(){
        firstNum = sc.nextDouble();
        return firstNum;
    }

    public Double getSecondNum(){
        secondNum = sc.nextDouble();
        return secondNum;
    }
    public String getOperator(){
        operator = operatorScanner.nextLine();
        return operator;
    }
}
