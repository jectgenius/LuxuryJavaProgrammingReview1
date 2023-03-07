package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_7 { // public으로 지정된 클래스 ch2_7 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.print("점 (x, y)의 좌표를 입력하시오>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        int x = sc.nextInt(); //int형 변수 x 선언 동시에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화
        int y = sc.nextInt();

        if((100 <= x) && (x <= 200) && (100 <= y) && (y <= 200)) // 만약 x가 100이상 200이하이고, y가 100이상 200이하이면
            System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다."); // println()메소드 호출하여 출력
        else // 그렇지 않으면, 4개중 한개라도 false이면
            System.out.println("(" + x + "," + y + ")는 사각형 밖에 있습니다.");

        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_7 클래스 정의 끝
