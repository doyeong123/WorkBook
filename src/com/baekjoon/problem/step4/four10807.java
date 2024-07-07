package com.baekjoon.problem.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//배열을 입력받고 v를 찾는 문제
//개수 세기
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	256 MB	136943	83912	71099	62.215%
//문제
//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다.
// 셋째 줄에는 찾으려고 하는 정수 v가 주어진다.
// 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
//
//출력
//첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
//
//예제 입력 1
//11
//1 4 1 2 4 2 4 2 3 4 4
//2
//예제 출력 1
//3
//예제 입력 2
//11
//1 4 1 2 4 2 4 2 3 4 4
//5
//예제 출력 2
//0
public class four10807 {


    public static void main(String[] args) throws IOException {

        //Scanner 방식


        /*Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b[] = new int[a];

        int count = 0;

        //배열로 a만큼 집어넣을려면 인덱스는 a-1로 기준잡아야 하기 때문에
        // i<a로 설정.
        for (int i = 0; i < a; i++) {

            b[i] = sc.nextInt();

        }

        int findnum = sc.nextInt();

        //마찬가지고 i<b.length로 설정
        for (int i = 0; i < b.length; i++) {

            if(b[i] == findnum)
            {
                count++;
            }
        }
        System.out.println(count);*/


        //BufferedReader 방식

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int Y[] = new int[X];
        int count = 0;
        StringTokenizer st;

        for (int i = 0; i < X; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            Y[i] = Integer.parseInt(st.nextToken());


        }

        int foundnum = Integer.parseInt(br.readLine());

        for (int i = 0; i < Y.length; i++) {

            if (foundnum == Y[i])
            {
                count++;
            }
        }

        System.out.println(count);

    }

}
