package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> calculator = new ArrayDeque<>();

        //масив от всички елементи ["2" "-" "2" "+" "5"]
        String[] input = scanner.nextLine().split("\\s+");

        //взема елементите от ляво на дясно
        for (int i = input.length - 1; i >= 0; i--) {
         calculator.push(input[i]);
        }

        //докато дължината на калкулатора е > 1
        while (calculator.size() > 1){
            //да взема числата от ляво
            int leftOperator = Integer.parseInt(calculator.pop());
            //взима операнда - + или -
            String operator = calculator.pop();
            //взема числата от дясно на израза
            int rightOperator = Integer.parseInt(calculator.pop());

            int sum = 0;

            if (operator.equals("+")){
               sum = leftOperator + rightOperator;
            }else if (operator.equals("-")){
                sum = leftOperator - rightOperator;
            }
            calculator.push(String.valueOf(sum));
        }
        System.out.println(calculator.pop());
    }
}
