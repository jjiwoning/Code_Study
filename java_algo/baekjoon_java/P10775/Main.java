package baekjoon_java.P10775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] parent;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int g = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        parent = new int[g + 1];

        for (int i = 1; i < g + 1; i++) {
            parent[i] = i;
        }

        int answer = 0;

        for (int i = 0; i < p; i++) {
            int airplane = Integer.parseInt(br.readLine());
            int nowGate = find(airplane);

            if (nowGate == 0) {
                break;
            }

            answer++;
            union(nowGate, nowGate - 1);
        }

        System.out.println(answer);
    }

    private static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            if (x < y) {
                parent[y] = x;
            }
            if (x > y) {
                parent[x] = y;
            }
        }
    }

    private static int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

}
