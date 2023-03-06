package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_5 { // public으로 지정된 ch2_5 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 레퍼헌스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.print("정수 3개를 입력하시오>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        int a = sc.nextInt(); // int형 변수 a 선언 동시에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        int b = sc.nextInt(); 
        int c = sc.nextInt();

        if((a + b) > c) // 만약 a, b 두변의 합이 c 보다 크면
            System.out.println("삼각형이 됩니다."); // println() 메소드 호출하여 삼각형이 됩니다. 안내 메세지 출력
        else if((a + c) > b) // 그렇지 않고 만약 a, c 두변의 합이 b 보다 크면
            System.out.println("삼각형이 됩니다.");
        else if((b + c) > a) // 그렇지 않고 만약 b, c 두변의 합이 a 보다 크면
            System.out.println("삼각형이 됩니다.");

        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_5 클래스 정의 끝
