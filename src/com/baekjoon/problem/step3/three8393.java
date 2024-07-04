package com.baekjoon.problem.step3;
//합 다국어
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	128 MB	292427	186681	157693	64.061%
//문제
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
//
//출력
//1부터 n까지 합을 출력한다.
//
//예제 입력 1
//3
//예제 출력 1
//6

import java.util.Scanner;

public class three8393 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        int x = 0;

        for (int i = 0; i <= c; i++) {
            x += i;
        }

        System.out.println(x);


    }
}
