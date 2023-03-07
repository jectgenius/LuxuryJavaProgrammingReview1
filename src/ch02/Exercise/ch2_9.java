package ch02.Exercise; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_9 { // public으로 지정된 클래스 ch2_9 정의 시작
    public static boolean inCircle(double xo, double yo, double radius, double x, double y) { // inCircle() 메소드 정의 시작, 점이 원 안에 있는지 판단
        double distance = Math.sqrt((xo-x)*(xo-x) + (yo-y)*(yo-y)); // double형 변수 distance 선언 동시에 Math 클래스의 sqrt() 메소드 호출하여 원의 중심과 입력 받은 점 사이의 거리 연산하여 리턴값 대입하여 초기화

        if(distance <= radius) { // 만약 distance가 radius보다 작거나 같으면, 즉 원의 중심과 입력 받은 점 사이의 거리가 원의 반지름 보다 작거나 같으면
            return true; // 이 점은 원의 내부에 있다.
        }
        else { // 그렇지 않으면, 즉 원의 중심과 입력 받은 점 사이의 거리가 원의 반지름 보다 크면
            return false; // 이 점은 원의 밖에 있다.
        }
    } // inCircle() 메소드 정의 끝

    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.print("원의 중심과 반지름 입력>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        double xo = sc.nextDouble(); // double형 변수 xo 선언 동시에 sc 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 실수 리턴 받아 대입하여 초기화, 원의 줌심의 x좌표
        double yo = sc.nextDouble(); // 원의 중심의 y좌표
        double radius = sc.nextDouble(); // 원의 반지름 길이
        System.out.print("점 입력>>"); // 원의 내부에 있는지 판단할 점
        double x = sc.nextDouble(); // 판단할 점의 x좌표
        double y = sc.nextDouble(); // 판단할 점의 y좌표

        if(inCircle(xo, yo, radius, x, y) == true) { // 만약 inCircle() 메소드를 호출하여 리턴 받은 값이 true이면
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다."); // println() 메소드 호출하여 출력
        }
        else { // 그렇지 않으면, 즉 false이면
            System.out.println("점 (" + x + ", " + y + ")는 원 밖에 있다.");
        }

        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_9 클래스 정의 끝