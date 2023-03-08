package ch03.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파이러에게 경로명 알려줌

public class ContinueExample { // public으로 지정된 ContinueExample 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 헝의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스형 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.println("정수를 5개 입력하세요."); // println() 메소드 호출하여 입력 안내 메세지 출력
        int sum = 0; // int형 변수 sum 선언 동시에 0 대입하여 초가화, 양수들의 합 저장
        for(int i = 0; i<5; i++) { // int형 변수 i 선언 동시에 0 대입하여 초기화, i가 5보다 작을동안 반복, i에 +1, 정수 5개 입력
            int n = sc.nextInt(); // int형 변수 n 선언 동시에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화

            if(n <= 0) // 만약 n이 0보다 작거나 같으면, 즉 사용자가 입력한 정수가 양수가 아니면
                continue; // 다음 반복으로 넘어감
            else // 그렇지 않으면, 즉 사용자가 입력한 정수가 양수이면
                sum += n; // sum에 +n
        } // for문 끝
        System.out.println("양수의 합은 " + sum); // println() 메소드 호출하여 출력

        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ConinueExample 클래스 정의 끝
