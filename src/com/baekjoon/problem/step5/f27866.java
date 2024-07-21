package com.baekjoon.problem.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//문자열을 입력받고 문자열의 특정 위치를 읽어 봅시다.
//문자와 문자열
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	1024 MB	77927	52021	47619	67.857%
//문제
//단어
//$S$와 정수
//$i$가 주어졌을 때,
//$S$의
//$i$번째 글자를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 영어 소문자와 대문자로만 이루어진 단어
//$S$가 주어진다. 단어의 길이는 최대
//$1\,000$이다.
//
//둘째 줄에 정수
//$i$가 주어진다.
//
//출력
// 
//$S$의
//$i$번째 글자를 출력한다.
//
//예제 입력 1
//Sprout
//3
//예제 출력 1
//r
//예제 입력 2
//shiftpsh
//6
//예제 출력 2
//p
//예제 입력 3
//Baekjoon
//4
//예제 출력 3
//k
public class f27866 {

    public static void main(String[] args) throws IOException {
/*

        //Scanner 방식

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        //charAt()은 0부터 시작하기 때문에 -1을 해준다.
        int i = sc.nextInt()-1;

        System.out.println(S.charAt(i));
*/


        //BufferedReader 방식
        //S문자의 i번째를 출력해야하기 때문에
        //S문자 입력을 받을 변수와 charAt()메서드를 통하여
        //i번째 입력으로 하여금 결과를 도출하게 만든다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열 S변수 입력
        String S = br.readLine();

        //입력받을 i번째 정수 입력
        //charAt()메서드는 0부터 시작하기 때문에 -1을 해준다.
        int i = Integer.parseInt(br.readLine()) -1;

        System.out.println(S.charAt(i));


    }
}
