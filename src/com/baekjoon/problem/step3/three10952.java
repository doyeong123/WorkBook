package com.baekjoon.problem.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//A+B - 5
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	256 MB	301606	158867	135196	52.433%
//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//입력의 마지막에는 0 두 개가 들어온다.
//
//출력
//각 테스트 케이스마다 A+B를 출력한다.
//
//예제 입력 1
//1 1
//2 3
//3 4
//9 8
//5 2
//0 0
//예제 출력 1
//2
//5
//7
//17
//7
public class three10952 {

    public static void main(String[] args) throws IOException {


        //Scanner 방식
        /*
        Scanner sc = new Scanner(System.in);

        while(true) {

            int a,b;

            a = sc.nextInt();
            b = sc.nextInt();



            if (a == 0 & b == 0) {
                sc.close();
                break;
            }
            System.out.println(a+b);
        }*/


        //BufferedReader 방식

       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            int x,y;

            x = Integer.parseInt(br.readLine());
            y = Integer.parseInt(br.readLine());


            if (x == 0 && y == 0) {
                br.close();
                break;
            }

            System.out.println(x+y);


        }*/


        //StringBuilder StringTokenizer방식

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        while (true) {

            st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0) {
                break;

            }

            sb.append(x + y).append('\n');


        }
        System.out.println(sb);*/

        //StringBuilder String.CharAt()방식2
        //BufferedReader - 문자열을 효율적으로 읽을 수 있는 클래스
        //InputStreamReader 표준 스트림인 System.in을 문자 스트림으로 변환,
        //이를통해 사용자가 입력을 받을 수가 있음.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //StringBuilder는 문자열을 효율적으로 생성, 수정할 수 있는 클래스
        //더해서 사용자 입력에 대한 결과를 누적해서 저장하는데에 사용
        StringBuilder sb = new StringBuilder();

        //무한 루프
        while (true) {

            //사용자의 입력받은 문자열 한줄을 입력받아 x에 저장.
            String x = br.readLine();

            //입력 문자열의 문자를 가져와서 아스키코드 표현식을 -48을 통해 정수로 입력.
            int a = x.charAt(0) - 48;
            int b = x.charAt(2) - 48;

            //사용자가 입력한 숫자가 모두 0이면 프로그램 종료.
            if (a == 0 && b == 0) {
                break;
            }

            //StringBuilder에 a+b와 줄바꿈을 입력.
            sb.append(a + b).append('\n');
        }
        //StringBuilder에 누적된 모든 결과를 출력.
        System.out.println(sb);


    }
}
