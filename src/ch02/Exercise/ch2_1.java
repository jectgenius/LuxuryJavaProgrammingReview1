package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌
 
public class ch2_1 { // public으로 지정된 클래스 ch2_1 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 헤퍼런스변수 scanner 선언 동시에 Scanenr 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.print("원화를 입력하세요(단위 원)>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        int won = scanner.nextInt(); // int형 변수 won 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        double dollar = won / 1100.0; // double형 변수 dollar 선언 동시에 달러로 변환 연산하여 결과를 대입하여 초기화

        System.out.println(won + "원은 &" + dollar + "입니다."); // println() 메소드 호출하여 출력

        scanner.close(); // scanner 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_1 클래스 정의 끝
