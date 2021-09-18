package StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumberofElementstoPush = scanner.nextInt();
        int snumberOfElementsToPop = scanner.nextInt();
        int xCheckwhetherIspresent = scanner.nextInt();

        ArrayDeque<Integer>stack = new ArrayDeque<>();

        for (int i = 1; i <= nNumberofElementstoPush; i++) {
                stack.push(scanner.nextInt());
        }

        for (int i = 1; i <= snumberOfElementsToPop; i++) {
            stack.pop();
        }

        if (stack.contains(xCheckwhetherIspresent)){
            System.out.println("true");
        }else {
            if (!stack.isEmpty()){
                System.out.println(Collections.min(stack));
            }else {
                System.out.println(0);
            }
        }
    }
}
