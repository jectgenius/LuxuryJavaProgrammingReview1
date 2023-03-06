package ch02.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Grading { // public으로 지정된 Grading 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        char grade; // char형 변수 grade 선언
        Scanner scanner = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 헤퍼런스 변수 scanner 선언 동시에 Scanner 클래스로 객체 생성하여 대입하여 초기화

        System.out.print("정수를 입력하세요(0~100): "); // print() 메소드 호출하여 입력 안내 메세지 출력
        int score = scanner.nextInt(); // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        if(score >= 90) // 만약 score가 90 보다 크거나 같으면, 즉 90이상이면
            grade = 'A'; // grade에 문자 'A' 대입
        else if(score >= 80) // 그렇지 않고, 만약 score가 80 보다 크거나 같으면, 즉 90미만 80이상이면
            grade = 'B'; // grade에 문자 'B' 대입
        else if(score >= 70) // 그렇지 않고, 만약 score가 70보다 크거나 같으면, 즉 80미만 70이상이면
            grade = 'C'; // grade에 문자 'C' 대입
        else if(score >= 60) // 그렇지 않고, 만약 score가 60보다 크거나 같으면, 즉 70미만 60이상이면
            grade = 'D'; // grade에 문자 'D' 대입
        else // 그렇지 않으면, 즉 score가 60미만이면
            grade = 'F'; // grade에 문자 'F' 대입
        System.out.println("학점은 " + grade + "입니다."); // println() 메소드 호출하여 학점 안내 메세지 출력

        scanner.close(); // scanner 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 헝의 끝
} // Grading 클래스 정의 끝
