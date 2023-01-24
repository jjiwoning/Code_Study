package study.week1.P11279;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int now = sc.nextInt();
            if (now == 0) {
                if (!priorityQueue.isEmpty()) {
                    System.out.println(priorityQueue.poll());
                } else {
                    System.out.println(0);
                }
                continue;
            }
            priorityQueue.add(now);
        }
    }
}
