package Bronze5;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] inputs = new int[N];

        for (int i = 0; i < N; i++) {
            inputs[i] = sc.nextInt();
        }

        int V = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (inputs[i] == V) {
                count++;
            }
        }

        System.out.println(count);

    }
}
