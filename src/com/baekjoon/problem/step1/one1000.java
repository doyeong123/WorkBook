package com.baekjoon.problem.step1;

import java.util.Scanner;

//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//첫째 줄에 A+B를 출력한다.
public class one1000 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
    }


}
