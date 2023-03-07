package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_11_1 { // public으로 지정된 ch2_11_1 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.print("달을 입력하세요(1~12)>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        int month = sc.nextInt(); // int형 변수 month 선언 동시에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 읿력 받은 정수 리턴 받아 대입하여 초기화

        if((3 <= month) && (month <= 5)) { // 만약 month가 3보다 크거나 같고 5보다 작거나 같다면, 즉 3, 4, 5월 이면
            System.out.println("봄"); // println() 메소드 호출하여 봄 출력
        }
        else if((6 <= month) && (month <= 8)) { // 그렇지 않고, 만약 month가 6보다 크거나 같고 8보다 작거나 같다면, 즉 6, 7, 8월 이면
            System.out.println("여름"); // println() 메소드 호출하여 여름 출력
        }
        else if((9 <= month) && (month <= 11)) { // 그렇지 않고, 만약 month가 9보다 크거나 같고 11 보다 작거나 같다면, 즉 9, 10, 11월 이면
            System.out.println("가을"); // println() 메소드 호출하여 가을 출력
        }
        else if((month == 12) || (month == 1) || (month == 2)) { // 그렇지 않고, 만약 month가 12 또는 1 또는 2와 같다면, 즉 12, 1, 2월이면
            System.out.println("겨울"); // println() 메소드 호출하여 겨울 출력
        }
        else { // 그렇지 않으면, 즉 1~12월이 아니면
            System.out.println("잘못입력"); // println() 메소드 호출하여 잘못입력 출력
        }

        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_11_1 클래스 정의 끝

/*
else if로 걸러졌기 때문에 12, 1, 2월 부분을 아래와 같이 해도 문제없다.

else if((1 <= m) && (m <= 12)) {
	System.out.print("겨울")
}

 */