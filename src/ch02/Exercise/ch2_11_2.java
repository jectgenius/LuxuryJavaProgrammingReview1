package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanenr 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_11_2 { // public으로 지정된 ch2_11_2 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스형 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성 동시에 대입하여 초기화

        System.out.print("달을 입력하세요(1~12)>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        int month = sc.nextInt(); // int형 변수 month 선언 동시에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화

        switch(month) { // month가
            case 3: // 3인 경우
            case 4: // 4인 경우
            case 5: // 5인 경우
                System.out.println("봄"); // println() 메소드 호출하여 봄 출력
                break; // switch문을 빠져나감
            case 6: // 6인 경우
            case 7: // 7인 경우
            case 8: // 8인 경우
                System.out.println("여름"); // println() 메소드 호출하여 여름 출력
                break; // switch문을 빠져나감
            case 9: // 9인 경우
            case 10: // 10인 경우
            case 11: // 11인 경우
                System.out.println("가을"); // println() 메소드 호출하여 가을 출력
                break; // switch문을 빠져나감
            case 12: // 23인 경우
            case 1: // 1인 경우
            case 2: // 2인 경우
                System.out.println("겨울"); // println() 메소드 호출하여 겨울 출력
                break; // switch문을 빠져나감
            default: // 어떤 case에도 해당하지 않는 경우
                System.out.println("잘못입력"); // println() 메소드 호출하여 잘못입력 출력
                break; // switch문을 빠져나감
        } // switch문 끝

        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_11_2 클래스 정의 끝
