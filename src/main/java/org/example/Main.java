package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        int n = in.nextInt();
        in.close();

        PrintWriter out = new PrintWriter("output.txt");
        int result = countDivisibleByThree(n);
        out.println(result);
        out.close();
    }

    public static int countDivisibleByThree(int n) {
        int count = 0;
        int currentNumber = 0;

        for (int i = 1; i <= n; i++) {
            currentNumber = currentNumber * 10 + i;
            currentNumber %= 3;
            if (currentNumber == 0) {
                count++;
            }
        }

        return count;
    }
}