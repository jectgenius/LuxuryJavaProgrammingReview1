package ch02.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class NestedIf { // public으로 지정된 클래스 NestedIf 정의 시작
    public static void main(String[] args) { // amin() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 레퍼런스 변수 scanneer 선언 동시에 Scanner 클래슬로 만든 객체 생성하여 대입하여 초기화

        System.out.print("점수를 입력하세요(0~100): "); // print() 메소드 호출하여 입력 안내 메세지 출력
        int score = scanner.nextInt(); // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        System.out.print("하견을 입력하세요(3~4): "); // print() 메소드 호출하여 입력 안내 메세지 출력
        int year = scanner.nextInt(); // int형 변수 year 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화

        if(score >= 60) { // 만약 score가 60보다 크거나 같으면, 즉 60이상이면
            if(year != 4) // 만약 year가 4가 아니면
                System.out.println("합격!"); // println() 메소드 호출하여 출력
            else if(score >= 70) // 그렇지 않고 score가 70보다 크거나 같으면, 즉 4학년이고 socre가 70이상이면 
                System.out.println("합격!"); // println() 메소드 호출하여 출력
            else // 그렇지 않으면, 즉 4학년이고 socre가 60이상 70미만이면
                System.out.println("불합격!"); // println() 메소드 호출하여 출력
        }
        else // 그렇지 않으면, 즉 socre가 60미만이면
            System.out.println("불합격!"); // println() 메소드 호출하여 출력

        scanner.close(); // scanner 객체의 close() 메소드 호출하여 닫기
    } // amin() 메소드 정의 끝
} // NestedIf 클래스 정의 끝
