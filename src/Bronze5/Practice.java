package Bronze5;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] defaultPieces = {1, 1, 2, 2, 2, 8};
        int[] inputPieces = new int[6];

        for (int i = 0; i < 6; i++) {
            inputPieces[i] = sc.nextInt();

        }

        for (int i = 0; i < 6; i++) {
            System.out.print(defaultPieces[i] - inputPieces[i] + " ");
        }

    }

}
