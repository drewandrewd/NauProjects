package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class First {

    static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fillAndPrint(scanner.nextInt());
        findLastPositive();
    }

    public static void fillAndPrint(int size) {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void findLastPositive() {
        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];
            if (curr > 0) {
                System.out.println(curr);
                break;
            }
        }
    }
}
