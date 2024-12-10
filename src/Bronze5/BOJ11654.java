package Bronze5;

import java.util.Scanner;

public class BOJ11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        
        System.out.println((int)input);
    }
}
/* 자바에서 입력은 항상 String으로 받는다 */
//next()는 단어 단위로 입력을 받아야 할 때 적합하고, nextLine()은 줄 단위로 전체를 받아야 할 때 적합합니다.