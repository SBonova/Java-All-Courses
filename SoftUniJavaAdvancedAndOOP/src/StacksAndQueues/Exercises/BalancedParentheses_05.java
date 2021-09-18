package StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        ArrayDeque<Character> openClosedBrackets = new ArrayDeque<>();

        boolean isBalanced = false;

        for (int i = 0; i < expression.length(); i++) {
            char currentBracket = expression.charAt(i);
            //проверка дали скобата е отворена -> {, [, (
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                openClosedBrackets.push(currentBracket);
            } else if (currentBracket == ')' || currentBracket == '}' || currentBracket == ']') {
                if (openClosedBrackets.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char closedBrackets = openClosedBrackets.pop();

                if (closedBrackets == '(' && currentBracket == ')') {
                    isBalanced = true;
                } else if (closedBrackets == '{' && currentBracket == '}') {
                    isBalanced = true;
                } else if (closedBrackets == '[' && currentBracket == ']') {
                    isBalanced = true;
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
