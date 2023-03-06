package ch02.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class GradingSwitch { // public으로 지정된 GradingSwitch 클래스 정의 시작
    public static void main(String[] args) { // main() 메소즈 정의 시작
        Scanner scanner = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 헤퍼런스 변수 scanner 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        char grade; // char형 변수 grade 선언
        System.out.print("점수를 입력하세요(0~100): "); // print() 메소드 호출하여 입력 안내 메세지 출력
        int score = scanner.nextInt(); // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화
        switch(score/10) { // score 나누기 10 연산 결과가
            case 10: // 10인 경우
            case 9: // 9인 경우
                grade = 'A'; // grade에 문자 'A' 대입
                break; // switch문을 빠져나감
            case 8: // 8인 경우
                grade = 'B'; // grade에 문자 'B' 대입
                break; // switch문을 빠져나감
            case 7: // 7인 경우
                grade = 'C'; // grade에 문자 'C' 대입
                break; // switch문을 빠져나감
            case 6: // 6인 경우
                grade = 'D'; // grade에 문자 'D' 대입
                break; // switch문을 빠져나감
            default: // 모두 아닌 경우
                grade = 'F'; // grade에 문자 'D' 대입
        } // switch문 끝
        System.out.println("학점은 " + grade + "입니다."); // println() 메소드 호출하여 학덤 안내 메세지 출력

        scanner.close(); // scanner 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // GradingSwithc 클래스 정의 끝
