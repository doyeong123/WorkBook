package com.baekjoon.problem.step3;

import java.io.*;
import java.util.Scanner;

//별 찍기 - 2
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	128 MB	337652	188360	158697	55.990%
//문제
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//
//입력
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//출력
//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//
//예제 입력 1
//5
//예제 출력 1
//    *
//   **
//  ***
// ****
//*****
//hint 행반복,공백반복,별반복
public class three2439 {

    public static void main(String[] args) throws IOException {

        //Scanner 방식

        /*Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        sc.close();

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a - i; j++) {

                System.out.println(" ");

            }

            for (int k = 0; k <= i; k++) {

                System.out.println("*");

            }

            System.out.println();
        }*/

        //BufferedReader 방식

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        for (int i = 1; i <= X; i++) {
            for (int j = 1; j <= X - i; j++) {
                System.out.println(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
        br.close();*/

        //StringBuilder 방식

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int F = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= F; i++) {

            for (int j = 1; j <= F - i; j++) {

                sb.append(' ');
            }
            for (int k = 1; k <= i; k++) {

                sb.append('*');
            }

            sb.append('\n');

        }

        System.out.println(sb);*/


        //BufferedWriter 방식

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine());

        for (int i = 1; i <= P; i++) {

            for (int j = 1; j <= P - i; j++) {

                bw.write(' ');
            }
            for (int k = 1; k <= i; k++) {

                bw.write('*');
            }

            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();

    }


}
