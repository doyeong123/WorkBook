package com.baekjoon.problem.step5;

import java.util.Scanner;

//문...제
//문자열
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	128 MB	80418	51152	46400	64.395%
//문제
//문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
//
//입력
//입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다.
// 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
//
//출력
//각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
//
//예제 입력 1
//3
//ACDKJFOWIEGHE
//O
//AB
//예제 출력 1
//AE
//OO
//AB
public class f9086 {

    public static void main(String[] args) {

        //Scanner방식
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        //N개 입력받을 정수 생성
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            //문자열 입력 변수 생성
            String W = sc.next();

            System.out.println(W.substring(0,1)+W.substring(W.length()-1,W.length()));

        }

    }

}
