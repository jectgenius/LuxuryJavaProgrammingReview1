package ch02.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ArithmeticOperator { // public으로 선언된 ArithmeticOperator 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.print("정수를 입력하세요: "); // print() 메소드 호출하여 입력 안내 메세지 출력
        int time = scanner.nextInt(); // int형 변수 time 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴받아 대입하여 초기화
        int second = time % 60; // int형 변수 second 선언 동시에 초 연산하여 대입하여 초기화
        int minute = (time / 60) % 60; // int형 변수 minute 선언 동시에 분 연산하여 대입하여 초기화
        int hour = (time / 60) / 60; // int형 변수 hout 선언 동시에 시간 연산하여 대입하여 초기화

        System.out.print(time + "초는 "); // print() 메소드 호출하여 출력
        System.out.print(hour + "시간, "); // print() 메소드 호출하여 출력
        System.out.print(minute + "분, "); // print() 메소드 호출하여 출력
        System.out.println(second + "초입니다. "); // println() 메소드 호출하여 출력
  
        scanner.close(); // scanner 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ArithmeticOperator 클래스 정의 끝
