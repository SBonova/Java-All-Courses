package StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer>queue = new ArrayDeque<>();

        int nAdd = scanner.nextInt();
        int sPoll = scanner.nextInt();
        int xPeek = scanner.nextInt();

        for (int i = 1; i <= nAdd; i++) {
            queue.offer(scanner.nextInt());
        }

        for (int i = 1; i <= sPoll; i++) {
            queue.poll();
        }

        if (queue.contains(xPeek)){
            System.out.println("true");
        }else {
            if (!queue.isEmpty()){
                System.out.println(Collections.min(queue));
            }else {
                System.out.println(0);
            }
        }
    }
}
