package ch02.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class SuccessOrFail { // SuccessOrFail 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 헤퍼런스 변수 scanner 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.print("점수를 입력하시오: "); // print() 메소드 호출하여 입력 안내 메세지 출력
        int score = scanner.nextInt(); // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화
        if (score >= 80) // 만약 score가 80보다 크거나 같으면
            System.out.println("축하합니다! 합격입니다."); // println() 메소드 호출하여 출력
 
        scanner.close(); // scanner 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // SuccessOrFail 클래스 정의 끝
