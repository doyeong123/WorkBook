package com.baekjoon.problem.step3;

//빠른 A+B
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초 (하단 참고)	512 MB	331212	149519	120871	45.524%
//문제
//본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다.
// 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
//
/*//C++을 사용하고 있고 cin/cout을 사용하고자 한다면,
// cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해 주고,
// endl 대신 개행문자(\n)를 쓰자.
// 단, 이렇게 하면 더 이상 scanf/printf/puts/getchar/putchar 등 C의 입출력 방식을 사용하면 안 된다.
//Python을 사용하고 있다면, input 대신 sys.stdin.readline을 사용할 수 있다.
// 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 .rstrip()을 추가로 해 주는 것이 좋다.*/

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
//

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

//또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다.
// 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
//
//자세한 설명 및 다른 언어의 경우는 이 글에 설명되어 있다.
//
//https://www.acmicpc.net/blog/view/55에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.
//
//입력
//첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
// 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
//
//출력
//각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
//
//예제 입력 1
//5
//1 1
//12 34
//5 500
//40 60
//1000 1000
//예제 출력 1
//2
//46
//505
//100
//2000
public class three15552 {

    public static void main(String[] args) throws IOException {


        //기존 Scanner방식

//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//
//        for (int i = 0; i < a; i++) {
//
//            int x,y;
//
//            x = sc.nextInt();
//            y = sc.nextInt();
//
//            System.out.println(x+y);
//
//        }


    /*    //BufferedWriter 사용.

        //사용자로부터 입력받기 위한 BufferedReader생성.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과를 출력하기 위한 BufferedWriter를 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //사용자로부터 입력받는 값을 정수형으로 변환해 N에 저장.
        int N = Integer.parseInt(br.readLine());

        //StringTokenizer 객체는 문자열을 토큰으로 분리하는데 사용.
        StringTokenizer st;

        //N번 반복하는 for문 시작.
        for (int i = 0; i < N; i++) {

            //사용자로부터 입력받는 값을 공백 문자를 기준으로 토큰화해서 st에 저장.
            st = new StringTokenizer(br.readLine()," ");
            //토큰화 된 두 숫자를 정수로 변환을 시켜서 결과를 BufferedWriter에 출력.
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        //BufferdReader를 닫음.
        br.close();

        //BufferedWriter에 남아있는 모든 출력 데이터를 강제로 출력.
        bw.flush();
        //BUfferedWriter를 닫음.
        bw.close();*/


        //BufferedBuilder 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            sb.append(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())).append('\n');

        }
        br.close();


        System.out.println(sb);
    }

}
