package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_2 { // public으로 지정된 ch2_2 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 헤퍼런스 변수  scanner 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.print("2자리수 정수 입력(10~99)>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        int number = scanner.nextInt(); // int형 변수 number 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        int ten = number / 10; // int형 변수 ten 선언 동시에 number를 10으로 나눈 연산 결과를 대입하여 초기화, 즉 입력 받은 수의 10의 자리 수
        int one = number % 10; // int형 변수 one 선언 동시에 number를 10으로 나눈 나머지 연산 결과를 대입하여 초기화, 즉 입력 받은 수의 1의 자리 수

        if(ten == one) { // 만약 ten 과 one이 같다면, 즉 10의 지리 수와 1의 자리수가 같다면
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다."); // println() 메소드 호출하여 출력
        }
        else { // 그렇지 않으면, 즉 10의 자리 수와 1의 자리 수가 다르면
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다."); // println() 메소드 호출하여 출력
        }

        scanner.close(); // scanner 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_2 클래스 정의 끝
