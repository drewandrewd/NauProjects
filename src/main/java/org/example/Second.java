package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Second {

    static ArrayList<Double> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fillAndPrint(scanner.nextInt());
        sort();
        scanner.close();
    }

    public static void fillAndPrint(int size) {
        for (int i = 0; i < size; i++) {
            arr.add(new Random().nextDouble());
        }
        System.out.println(arr);
    }

    public static void sort() {
        for (int i = 0; i < arr.size(); i++) {
            double min = arr.get(i);
            int position = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (min > arr.get(j)) {
                    min = arr.get(j);
                    position = j;
                }
            }
            arr.set(position, arr.get(i));
            arr.set(i, min);
        }
        System.out.println(arr);
    }
}
