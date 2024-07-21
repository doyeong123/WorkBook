package com.baekjoon.problem.step5;

import java.util.Scanner;

//정수를 문자열로 입력받는 문제. Python처럼 정수 크기에 제한이 없다면 상관 없으나,
// 예제 3은 일반적인 정수 자료형에 담기에 너무 크다는 점에 주목합시다.
//숫자의 합
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	256 MB	266759	147849	121558	55.911%
//문제
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
//
//출력
//입력으로 주어진 숫자 N개의 합을 출력한다.
//
//예제 입력 1
//1
//1
//예제 출력 1
//1
//예제 입력 2
//5
//54321
//예제 출력 2
//15
//예제 입력 3
//25
//7000000000000000000000000
//예제 출력 3
//7
public class f11720 {

    public static void main(String[] args) {

        //Scanner 방식
        Scanner sc = new Scanner(System.in);

        //몇번 반복할지 입력받는 변수
        int NN = sc.nextInt();

        //N개의 숫자 문자열 입력 받는 변수
        String N = sc.next();

        //합한걸 담을 변수
        int sum = 0;

        for(int i=0; i<NN;i++)
        {
            sum += N.charAt(i)-'0';
        }

        System.out.println(sum);


    }

}
