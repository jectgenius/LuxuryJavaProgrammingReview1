package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_12_1 { // public으로 지정된 ch2_12_1 클래스 정의 시작
    public static double add(double number1, double number2) { // add() 메소드 정의 시작, 두 수의 합
        double result = number1 + number2; // double형 변수 result 선언 동시에 number1과 number2의 연산 결과 대입하여 초기화
        return result; // result 리턴
    }
    public static double sub(double number1, double number2) { // sub() 메소드 정의 시작, 두 수의 뺄셈
        double result = number1 - number2;
        return result;
    }
    public static double mul(double number1, double number2) { // mul() 메소드 정의 시작, 두 수의 곱
        double result = number1 * number2;
        return result;
    }
    public static double div(double number1, double number2) { // div() 메소드 정의 시작, 두 수의 나눗셈
        double result = number1 / number2;
        return result;
    }

    public static void main(String[] arsg) { // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스 형 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.print("연산>>"); // print() 메소드 출력하여 입력 안내 메세지 출력
        double number1 = sc.nextDouble(); // double형 변수 number1 선언 동시에 sc 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 실수를 리턴 받아 대입하여 초기화, 피연산자1
        String operator = sc.next(); // 연산자
        double number2 = sc.nextDouble(); // 피연산자2
        double result = 0.0; // 결과값

        if(operator.equals("+")) { // 만약 operaotor가 문자열 "+"와 내용이 같다면, 즉 사용자가 +를 입력하였다면
            result = add(number1, number2); // add() 메소드 호출하여 두 수의 덧셈 결과 리턴 받아 변수 result에 대입
        }
        else if(operator.equals("-")) {
            result = sub(number1, number2);
        }
        else if(operator.equals("*")) {
            result = mul(number1, number2);
        }
        else if(operator.equals("/")) {
            if(number2 == 0) { // 만약 number2가 0이면, 즉 0으로 나누고자 한다면
                System.out.println("0으로 나눌 수 없습니다."); // println() 메소드 호춣하여 메세지 출력
                return; // main() 메소드 종료
            }
            else { // 그렇지 않으면, 즉 0이외의 수로 나누고자 한다면
                result = div(number1, number2);
            }
        }

        System.out.println(number1 + operator + number2 + "의 계산 결과는 " + result); // println() 메소드 호출하여 출력

        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_12_1 클래스 정의 끝
