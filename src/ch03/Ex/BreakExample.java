package ch03.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class BreakExample { // public으로 지정된 BreakExample 클래스 정의 시작
    public static void main(String[] args) { // maiN() 메소드 정의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스형 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.println("exit을 입력하연 종료합니다."); // println() 메소드 호출하여 안내 메세지 출력
        while(true) { // 무한반복
            System.out.print(">>"); // print() 메소드 호출하여 입력 안내 메세지 출력
            String text = sc.nextLine(); // String 클래스형 레퍼런스 변수 text 선언 동시에 sc 객체의 nextLine() 메소드 호출하여 사용자로부터 입력 받은 문자열을 리턴 받아 대입하여 초기화
            if(text.equals("exit")) // 만약 text에 저정된 문자열의 내용이 exit이면
                break; // while문을 빠져나감
        } // while문 끝

        System.out.println("종료합니다..."); // println() 메소드 호출하여 종료합니다. 안내 메세지 출력

        sc.close(); // sc 개체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // BreakExample 클래스 정의 끝
