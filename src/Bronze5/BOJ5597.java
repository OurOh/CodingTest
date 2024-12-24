package Bronze5;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean [] submitted = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int studentNumber = sc.nextInt();
            submitted[studentNumber - 1] = true;
        }

        for (int i = 0; i < submitted.length; i++) {
            if (!submitted[i]) {
                System.out.println(i+1);
            }
        }


    }
}
