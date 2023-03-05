package ch02.Ex; // 패키지 선언문

public class TypeConversion { // public으로 선언된 클래스 TypeConversion 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        byte b = 127; // byte형 변수 b 선언 동시에 127 대입하여 초기화
        int i = 100; // int형 변수 i 선언 동시에 100 대입하여 초기화

        System.out.println(b+i); // println() 메소드 호출하여 b+i 연산 결과 출력
        System.out.println(10/4); // println() 메소드 호출하여 10/4 연산 결과 출력
        System.out.println(10.0/4); // println() 메소드 호출하여 10.0/4 연산 결과 출력, 4.0으로 자동 타입 변환
        System.out.println((char)0x12340041); // println() 메소드 호출하여 연산 결과 출력, char형으로 강제 타입 변환
        System.out.println((byte)(b+i)); // println() 메소드 호출하여 연산 결과 출력, byte형으로 강제 타입 변환
        System.out.println((int)2.9 + 1.8); // println() 메소드 호출하여 1 + 1.8 연산 결과 출력, 1.0으로 자동 타입 변환
        System.out.println((int)(2.9 + 1.8)); // println() 메소드 호출하여 연산 결과 출력, int형으로 강제 타입 변환
        System.out.println((int)(2.9) + (int)1.8); // println() 메소드 호출하여 연산 결과 출력, int형으로 강제 타입 변환
    } // main() 메소드 정의 시작
} // TypeConversion 클래스 정의 끝
