package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_10 { // public으로 지정된 클래스 ch2_10 정의 시작
    public static boolean overlapCircle(double ox1, double oy1, double radius1, double ox2, double oy2, double radius2) { // overlapCircle() 메소드 정의 시작, 두 원이 서로 겹치는지 판단
        double distance = Math.sqrt((ox1 - ox2) * (ox1 - ox2) + (oy1 - oy2) * (oy1 - oy2)); // double형 변수 distance 선언 동시에 Math 클래스의 sqrt() 메소드 호출하여 원의 두 점사이의 거리 연산 결과 리턴 받아 대입하여 초기화
        double radiusSum = radius1 + radius2; // double형 변수 radiusSum 선언 동시에 두 원의 반지름의 길이의 합 연산 결과 리턴 받아 대입하여 초기화

        if(distance <= radiusSum) { // 만약 distance가 radiusSum보다 작거나 같으면, 두 원의 중심사이의 거리가 두 원의 반지름의 합보다 적거나 같으면
            return true; // 두 원은 서로 겹친다.
        }
        else{ // 그렇지 않으면, 즉 두 원의 중심사이의 거리가 두 원의 반지름의 합보다 크면
            return false; // 두 원은 서로 겹치지 않는다.
        }
    } // overlapCircle() 메소드 정의 끝

    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.print("첫번째 원의 줌심과 반지름 입력>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        double ox1 = sc.nextDouble(); // double형 변수 ox1 선언 동시에 sc 객체의 nextDouble() 메소드 호출하여 사용잘부터 입력 받은 실수 리턴 받아 대입하여 초기화, 첫변째 원의 줌심의 x좌표
        double oy1 = sc.nextDouble(); // 첫번째 원의 줌심의 y좌표
        double radius1 = sc.nextDouble(); // 첫번째 원의 반지름
        System.out.print("두번째 원의 줌심과 반지름 입력>>"); // println() 멧소드 호출하여 입력 안내 메세지 출력
        double ox2 = sc.nextDouble(); // double형 변수 ox2 선언 동시에 sc 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 실수를 리턴 받아 대입하여 초기화, 두번째원의 줌싱의 x좌표
        double oy2 = sc.nextDouble(); // 두번재 원의 중심의 y좌표
        double radius2 = sc.nextDouble(); // 두번째 원의 반지름

        if(overlapCircle(ox1, oy1, radius1, ox2, oy2, radius2) == true) { // 만약 overlapCIrcle() 메소드를 호출하여 리턴 받은 값이 true이면, 즉 두 원이 서로 겹치면
            System.out.println("두 원은 서로 겹친다."); // println() 메소드 호출하여 출력
        }
        else { // 그렇지 않으면, 즉 두 원이 겹치지 않으면
            System.out.println("두 원은 서로 겹치지 않는다."); // println() 메소드 호출하여 출력
        }
 
        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_10 클래스 정의 끝
