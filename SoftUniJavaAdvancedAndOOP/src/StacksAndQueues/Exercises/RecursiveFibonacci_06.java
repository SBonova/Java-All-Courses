package StacksAndQueues.Exercises;

import java.util.Scanner;

public class RecursiveFibonacci_06 {
    public static long[] memoryForFibonacci;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recursive method- е тогава когато в себе си извиква собственият си метод
        //фактуриел = 5! = 5 * 4 * 3 * 2 * 1 ->n= n(n-1)

//        long result = 1;//започваме от 1, защото факториел от 0-ла връща 1
//        int n = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 1; i <= n ; i++) {
//             result = result * i;
//        }
//        System.out.println(result);

        //Fibonacci ot 3 = 2 + 1
        int n = Integer.parseInt(scanner.nextLine());
        memoryForFibonacci = new long[n + 1];
        System.out.println(fibonacci(n));
    }

    //примерен метод за фактуриел функция
//    public static int factorial(int n){
//        //дъно на рекурсията
//        if (n == 0){
//            return 1;
//        }else {
//            //рекурсивна функция, защото вика сама себе си
//            return n * factorial(n - 1);
//        }
//    }

    //примерен метод за намиране на фибоначи
    public static long fibonacci(int n){
        if (n <= 1){
            return 1;
        }
        if (memoryForFibonacci[ n] != 0){
            return memoryForFibonacci[n];
        }
        //fibonacci ot 2
        return memoryForFibonacci[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }
}
