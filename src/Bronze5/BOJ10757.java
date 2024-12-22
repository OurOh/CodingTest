package Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger sum = A.add(B);
        // BigInteger는 기본 산술연산자를 사용할 수 없기에 .add() 메서드를 사용해야한다.
        System.out.println(sum);
    }
}
