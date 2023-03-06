package ch02.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class MultipleOfThree { // public으로 선언된 MutilpleOfThree 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스로 만근 객체 생성하여 대입하여 초기화

        System.out.print("수를 입력하시오: "); // print() 메소드 호출하여 입력 안내 메세지 출력
        int number = scanner.nextInt(); // int형 변수 number 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로 부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        if(number % 3 == 0) // 만약 변수 number를 3으로 나눈 나머지가 0이면
            System.out.println("3의 배수입니다."); // println() 메소드 호출하여 3의 배수입니다. 안내 메세지 출력
        else // 그렇지 않으면
            System.out.println("3의 배수가 아닙니다."); // println() 메소드 호출하여 3의 배수가 아닙니다. 안내 메세지 출력

        scanner.close(); // scanner 객체의 메소드 close() 호출하여 닫기
    } // main() 메소드 정의 끝
} // MultipleOfThree 클래스 정의 끝
