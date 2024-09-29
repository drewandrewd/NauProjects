package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Fifth implements Task {

    Queue<String> queue = new LinkedList<>();
    boolean flag = true;
    @Override
    public void start() throws InterruptedException {
        for (String curr : queue) {
            if (flag) {
                System.out.println(curr);
            } else {
                break;
            }
        }
    }

    @Override
    public void stop() {
        flag = false;
    }

    public static void main(String[] args) throws InterruptedException {
        Fifth fifth = new Fifth();
        fifth.queue.add("a");
        fifth.queue.add("b");
        fifth.queue.add("c");
        fifth.queue.add("d");
        fifth.start();
    }
}
