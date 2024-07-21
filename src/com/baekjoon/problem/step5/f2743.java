package com.baekjoon.problem.step5;

import java.util.Scanner;

//문자열을 입력받고 길이를 재는 문제
//단어 길이 재기
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	128 MB	85047	67317	60689	80.216%
//문제
//알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
//
//출력
//첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
//
//예제 입력 1
//pulljima
//예제 출력 1
//8
public class f2743 {

    public static void main(String[] args) {

        //Scanner 방식
        Scanner sc = new Scanner(System.in);

        String W = sc.next();

        System.out.println(W.length());

    }

}
