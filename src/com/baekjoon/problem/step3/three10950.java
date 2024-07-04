package com.baekjoon.problem.step3;

import java.util.Scanner;

//A+B - 3
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	256 MB	319110	186067	155313	58.419%
//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//각 테스트 케이스마다 A+B를 출력한다.
//
//예제 입력 1
//5
//1 1
//2 3
//3 4
//9 8
//5 2
//예제 출력 1
//2
//5
//7
//17
//7
public class three10950 {

    public static void main(String[] args) {

        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        //정수 int인 변수 c를 입력받기 위함.
        int c = sc.nextInt();
        //길이가 c인 정수 배열 생성.
        int arr[] = new int[c];

        //c번 반복하는 for의 루프 시작.
        for (int i=0; i<c; i++) {

            //정수 a,b를 각각 입력받음.
            int a = sc.nextInt();
            int b = sc.nextInt();


            //a+b의 값을 arr 배열 i번째에 입력.
            arr[i] = a+b;

        }

        //Scanner객체를 더이상 입력받지 않음.
        sc.close();

        //arr의 각 요소를 반복하는 foreach문 시작.
        for(int k : arr){

            System.out.println(k);

        }



    }

}
