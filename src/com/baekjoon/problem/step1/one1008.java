package com.baekjoon.problem.step1;

import java.util.Scanner;
//문제
//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
public class one1008 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double a = sc.nextDouble();
        Double b = sc.nextDouble();

        System.out.println(a/b);

    }
}

//출력값이 소숫점까지 나오게 하여야하므로 nextInt()가 아닌 nextDouble()을 사용.
