package StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> wordStates = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();

        //въртим по броят на командите
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();//{номер} {параметър}
            //"1 [string]" -> ["1", "string"]
            //"2 [count]" -> ["2", "count"]
            //"3 [index]" -> ["3", "index"]
            //"4" ->["4"]
            String commandNumber = command.split("\\s+")[0];
            switch (commandNumber) {
                case "1":
                    //текст, който трябва да го добавя към съществуващия
                    String textAdd = command.split("\\s+")[1];
                    currentText.append(textAdd);
                    wordStates.push(currentText.toString());
                    break;
                case "2"://"2 [count]" - erases the last [count] elements from the text
                    int countElement = Integer.parseInt(command.split("\\s+")[1]);
                    int startIndex = currentText.length() - countElement;
                    currentText.delete(startIndex, startIndex + countElement);
                    wordStates.push(currentText.toString());
                    break;
                case "3"://"3 [index]" - returns the element at position [index] from the text
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    System.out.println(currentText.charAt(index - 1));
                    break;
                case "4":
                    if (wordStates.size() > 1) {
                        wordStates.pop();
                        currentText = new StringBuilder(wordStates.peek());
                    } else {
                        currentText = new StringBuilder();
                    }
                    break;
            }
        }
    }
}
