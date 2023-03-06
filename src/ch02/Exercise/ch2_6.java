package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_6 { // public으로 지정된 ch2_6 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성 동시에 대입하여 초기화

        System.out.print("1~99 사이의 정수를 입력하시오>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        int number  = sc.nextInt(); // int형 변수 number 선언 동시에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        int ten = number / 10; // int형 변수 ten에 10의 자리수 대입
        int one = number % 10; // int형 변수 one에 1의 자리수 대입
        int count = 0; // int형 변수 count 선언 동시에 0 대입하여 초기화

        if((ten == 3) || (ten == 6) || (ten == 9)) { // ten이 3 또는 6 또는 9이면
            count += 1; // count에 +1
        }
        if((one == 3) || (one == 6) || (one == 9)) { // one이 3 또는 6 또는 9이면
            count += 1; // count에 +1
        }

        if(count == 1) { // count가 1이면
            System.out.println("박수짝"); // println() 메소드 호출하여 출력
        }
        else if(count == 2) { // count가 2이면
            System.out.println("박수짝짝"); // println() 메소드 호출하여 출력
        }

         sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_6 클래스 정의 끝
