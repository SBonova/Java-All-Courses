package StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer>numbersStack = new ArrayDeque<>();
        String[] elements = scanner.nextLine().split("\\s+");

        for (String element : elements) {
            numbersStack.push(Integer.parseInt(element));
        }

        while (!numbersStack.isEmpty()){
            System.out.print(numbersStack.pop() + " ");
        }
    }
}
