package com.baekjoon.problem.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//A+B - 8
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	256 MB	207934	140793	124847	68.379%
//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
// x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
//
//예제 입력 1
//5
//1 1
//2 3
//3 4
//9 8
//5 2
//예제 출력 1
//Case #1: 1 + 1 = 2
//Case #2: 2 + 3 = 5
//Case #3: 3 + 4 = 7
//Case #4: 9 + 8 = 17
//Case #5: 5 + 2 = 7
public class three11022 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= A; i++) {

            st = new StringTokenizer(br.readLine()," ");
            int x,y;
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            System.out.println("Case #"+i+": "+x+" + "+y+" = "+(x+y));


        }

        br.close();

        //StringBuilder 방법

        /*
        //BufferedReader를 사용해 입력을 받습니다. InputStreamReader를 통해서
        //표준 입력 스트림을 읽습니다.--
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        //입력을 통해 받은 문자열이 Integer.parseInt 를 통해 정수형태로로 N에 저장.
        int N = Integer.parseInt(br2.readLine());

        //StringTokenizer를 통해 문자열을 토큰단위로 분리.
        StringTokenizer st2;
        //StringBuilder를 통해 출력 결과를 누적.
        StringBuilder sb = new StringBuilder();
        //for문 받는 정수N만큼 반복
        for (int i = 1; i <= N; i++) {
            //br.readLine()을 통해 입력받은 문자열을 공백을 기준으로 토큰화해서 st2에 저장.
            st2 = new StringTokenizer(br.readLine()," ");

            int a,b;
            //nextToken()을 통해 받은 문자열을 정수로 변환해서 a,b에 각각 저장
            a = Integer.parseInt(st2.nextToken());
            b = Integer.parseInt(st2.nextToken());

            //출력 문자열을 누적.
            sb.append("Case #" + i + ": ").append(a + " + " + b + " = " + (a + b)).append('\n');


        }
        br.close();
        System.out.println(sb);*/

    }

}
