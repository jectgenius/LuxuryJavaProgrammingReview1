package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_3 { // public으로 지정된 ch2_3 클래스 젖의 시작
    public static void main(String[] args) { // main() 멧소드 정의 시작
        Scanner scanner = new Scanner(System.in); // Scannsr 클래스로 만든 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화
        
        System.out.print("금액을 입력하시오>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        int money = scanner.nextInt(); // int형 변수 money 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        
        int man5 = money / 50000; // int형 변수 man5 선언 동시에 5만원권 개수 연산 결과 대입하여 초기화
        int man1 = money % 50000 / 10000; // int형 변수 man1 선언 동시에 안원권 개수 연산 결과 대입하여 초기화
        int cheon1 = money % 10000 / 1000; // int형 변수 cheon1 선언 동시에 천원권 개수 연산 결과 대입하여 초기화
        int baek1 = money % 1000 / 100; // int형 변수 baek1 선언 동시에 백원권 개수 연산 결과 대입하여 초기화
        int sib5 = money % 100 / 50; // int형 변수 sib5 선언 동시에 오십원권 개수 연산 결과 대입하여 초기화
        int sib1 = money % 50 / 10; // int형 변수 sib1 선언 동시에 십원권 개수 연산 결과 대입하여 초기화
        int ill1 = money % 10; // int형 변수 ill1 선언 동시에 일워권 개수 연산 결과 대입하여 초기화
        
        System.out.println("오만원권 " + man5 + "매"); // println() 메소드 호출하여 오만원권 개수 출력
        System.out.println("만원권 " + man1 + "매");
        System.out.println("천원권 " + cheon1 + "매");
        System.out.println("백원 " + baek1 + "개");
        System.out.println("오십원 " + sib5 + "개");
        System.out.println("십원 " + sib1 + "개");
        System.out.println("일원 " + ill1 + "개");
        
        scanner.close(); // scanner 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_3 정의 끝
