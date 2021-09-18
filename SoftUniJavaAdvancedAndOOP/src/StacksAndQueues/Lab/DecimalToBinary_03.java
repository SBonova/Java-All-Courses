package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> convert = new ArrayDeque<>();

        int number = Integer.parseInt(scanner.nextLine());

        while (number != 0) {
            convert.push(number % 2);
            number /= 2;
        }

        while (!convert.isEmpty()) {
            for (int i = 0; i < convert.size(); i++) {
                System.out.print(convert.pop());
            }
        }

//        while (number <= 0) {
//            System.out.println(0);
//        }

    }
}
