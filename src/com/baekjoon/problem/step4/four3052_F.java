package com.baekjoon.problem.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

//배열을 활용하여 서로 다른 값의 개수를 찾는 문제
//나머지 다국어
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	128 MB	222374	128487	106855	57.674%
//문제
//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
//
//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
//
//출력
//첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
//
/*예제 입력 1
1 2 3 4 5 6 7 8 9 10
예제 출력 1
10 */
//각 수를 42로 나눈 나머지는 1, 2, 3, 4, 5, 6, 7, 8, 9, 10이다.
public class four3052 {

    public static void main(String[] args) throws IOException {

//        //HashSet 방식
//        //HashSet이용하는 이유 : 문제에서 "서로 다른 값"이라고 말했기 때문에 중복되는 값이
//        //입력이 안되는 HashSet의 특징을 이용해 값이 n개 들어갔다는 것을 확인할 수 있다.
//        //중복원소 허용안하는 특징 외에 또 다른 특징으로 HashSet은 순서 개념이 없기때문에
//        //Collections.sort()메서드를 사용할 수가 없다. 따로 정렬을 하고 싶을 경우엔
//        //list로 변환 후에 정렬을 해줘야한다.
//
//        Scanner sc = new Scanner(System.in);
//
//        HashSet<Integer> h = new HashSet<Integer>();
//
//        for (int i = 0; i < 10; i++) {
//
//            h.add(sc.nextInt() % 42);
//            //입력받은 값을 42로 나눈 결과를 HashSet에 저장.
//        }
//
//        sc.close();
//
//        //중복 값 제외한 서로다른 값 갯수
//        System.out.println(h.size());
//

        //배열 방식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] bl = new boolean[42];
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {

            a[i] = Integer.parseInt(br.readLine()) % 42;

        }

        for (int rea : a) {

            bl[rea] = true;
        }

        int count = 0;

        for (boolean aa : bl) {
            if (aa) {
                count++;
            }
        }

        System.out.println(count);


    }
}
