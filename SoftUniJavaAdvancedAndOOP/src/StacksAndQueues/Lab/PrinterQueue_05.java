package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String>queue = new ArrayDeque<>();

       // String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("print")){
            if (command.equals("cancel")){
                String canceledFile = "";
                canceledFile = queue.poll();
                //когато опашката е празна връща null, затова се прави тази проверка
                if (canceledFile == null){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled" + " " + canceledFile);
                }
            }else {
                queue.offer(command);
            }
            command = scanner.nextLine();
        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
