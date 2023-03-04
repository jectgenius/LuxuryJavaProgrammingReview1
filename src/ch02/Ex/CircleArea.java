package ch02.Ex; // 패키지 선언문

public class CircleArea { // public으로 선언된 CircleArea 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        final double PI = 3.14; // double형 상수 PI 선언 동시에 초기화

        double radius = 10.0; // double형 변수 radius 선언 동시에 10.0 대입하여 초기화
        double circleArea = radius*radius*PI; // double형 변수 circleArea 선언 동시에 원의 면적 연산하여 초기화

        System.out.println("원의면적 = " + circleArea); // println() 메소드 호출하여 원의 면적 출력
    } // main() 메소드 정의 끝
} // CircleArea 클래스 정의 끝
