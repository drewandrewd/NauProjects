package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Fifth implements Task {

    private final Queue<String> queue = new LinkedList<>();
    private boolean flag = false;

    @Override
    public void start() {
        flag = true;

        while (flag) {
            if (!queue.isEmpty()) {
                String curr = queue.poll();
                System.out.println("Processing: " + curr);
            } else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
        Thread.sleep(5000);
        fifth.stop();
    }
}
