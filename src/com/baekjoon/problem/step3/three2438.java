package com.baekjoon.problem.step3;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

//별 찍기 - 1
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	128 MB	340651	209844	173562	62.196%
//문제
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//입력
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//출력
//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//
//예제 입력 1
//5
//예제 출력 1
//*
//**
//***
//****
//*****
public class three2438 {

    public static void main(String[] args) throws IOException {


        //Scanner방식
/*        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


        //BufferedReader 방식

       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        for (int i = 1; i <= A; i++) {

            for (int j = 1; j <= i; j++) {


                System.out.println("*");


            }

            System.out.println();

        }
        br.close();*/




        //StringBuilder 방식
       /* BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        int B = Integer.parseInt(br2.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= B; i++) {

            for (int j = 1; j <= i; j++) {

                sb.append('*');

            }
            sb.append('\n');
        }
        System.out.println(sb);*/




        //BufferedWriter
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int D = Integer.parseInt(br3.readLine());

        br3.close();

        for (int i = 1; i <= D; i++) {

            for (int j = 1; j <= i; j++) {

                bw.write('*');

            }

            bw.newLine();
        }
        bw.flush();
        bw.close();




    }
}
