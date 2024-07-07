package com.baekjoon.problem.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.
//EOF란?
//A+B - 4
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	256 MB	410237	148246	124233	35.985%
//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//각 테스트 케이스마다 A+B를 출력한다.
//
//예제 입력 1
//1 1
//2 3
//3 4
//9 8
//5 2
//예제 출력 1
//2
//5
//7
//17
//7
public class three10951 {

    public static void main(String[] args) throws IOException {

        //Scanner방식

        /*Scanner sc = new Scanner(System.in);

        int a,b;

        //정수형을 입력받는 동안에 계속해서 반복.
        while (sc.hasNextInt()) {

            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a+b);


        }
        sc.close();*/


        //StringBUilder 방식

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String x;

        while ((x = br.readLine()) != null) {

            int a,b;

            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            sb.append((a + b)).append('\n');

        }
        System.out.println(sb);







    }
}
