package Bronze5;

import javax.swing.*;
import java.util.Scanner;

public class BOJ2475 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[] inputs = new int[5];
        for (int i = 0; i < 5; i++) {
            inputs[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += inputs[i] * inputs[i];

        }

        System.out.println(sum % 10);

    }
}
