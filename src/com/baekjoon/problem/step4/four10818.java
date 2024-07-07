package com.baekjoon.problem.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//최솟값과 최댓값을 찾는 문제
//최소, 최대
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	256 MB	393638	177455	133716	43.973%
//문제
//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
// 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
// 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//출력
//첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
//
//예제 입력 1
//5
//20 10 35 30 7
//예제 출력 1
//7 35
public class four10818 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N[] = new int[X];

        StringTokenizer st;

        for (int i = 0; i < X; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            N[i] = Integer.parseInt(st.nextToken());


        }

        //Arrays.sort()메서드를 통해 배열 변수 N의 값
        Arrays.sort(N);
        //정렬되었기 때문에 0번과 N-1번을 통해 최소,최댓값 구하기.
        System.out.println(N[0]+" " +N[X-1]);



    }
}
