package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_4 { // public으로 지정된 클래스 ch2_4 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스 만든 객체 생성하여 대입하여 초기화

        System.out.print("정수 3개 입력>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        int number1 = scanner.nextInt(); // int형 변수 number1 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int median = 0; // int형 변수 median 선언 동시에 0으로 초기화, 중간 값

        if((number1 > number2) && (number1 > number2)) {
            if(number2 > number3) {
                median = number2;
            }
            else {
                median = number3;
            }
        }
        else if((number2 > number1) && (number2 > number3)) {
            if(number1 > number3) {
                median = number1;
            }
            else {
                median = number3;
            }
        }
        else if((number3 > number1) && (number3 > number2)) {
            if(number1 > number2) {
                median = number1;
            }
            else{
                median = number2;
            }
        }

        System.out.println("중간 값은 " + median); // println() 메소드 호출하여 중갑 값 안내 메세지 출력

        scanner.close(); // scanner 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_4 클래스 정의 끝
