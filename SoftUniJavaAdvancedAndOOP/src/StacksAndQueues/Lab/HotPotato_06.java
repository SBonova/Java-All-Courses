package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String>queue = new ArrayDeque<>();

        String[] childrenName = scanner.nextLine().split("\\s+");
        int passingNumber = Integer.valueOf(scanner.nextLine());

        //Hot potato is a game in which children form a circle and start passing a hot potato.
        //така обикалям масива childrenName и ги добавям в опашката queue
        for (String child : childrenName) {
            //offer-add an element to the queue
            queue.offer(child);
        }

        //This continues repeating until there is only one kid left.
        while (queue.size() > 1){
            //The counting starts with the fist kid.
            for (int i = 1; i < passingNumber; i++) {
               //Every nth toss the child left with the potato leaves the game.
                queue.offer(queue.poll());//pol()- returns and removes first element
            }
            //Print every kid that is removed from the circle
            System.out.println("Removed " + queue.poll());
        }
        //print the kid that is left last.
        System.out.println("Last is " + queue.poll());
    }
}
