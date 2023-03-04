package ch02.Ex; // 패키지 선언문

/* // 여러줄 주석
* 소스파일 : Hello.java
*/

public class Hello { // public으로 선언된 클래스 Hello 정의 시작

    public static int sum(int n, int m) { // sum() 메소드 정의 시작
        return n + m; // n + m 연산 결과 리턴
    } // sum() 메소드 정의 끝

    public static void main(String[] args) { // main() 메소드 정의 시작
        int i = 20; // int형 변수 i 선언 동시에 20으로 대입하여 초기화
        int s; // int형 변수 s 선언
        char a; // char형 변수 a 선언

        s = sum(i, 10); // s에 sum() 메소드 호출하여 리턴 받은 값 대입
        a = '?'; // a에 문자 ? 대입
        System.out.println(a); // println() 메소드 호출하여 변수 a 출력
        System.out.println("Hello"); // println() 메소드 호출하여 문자열 Hello 출력
        System.out.println(s); // println() 메소드 호출하여 변수 s 출력
    } // main() 메소드 정의 끝
} // Hello 클래스 정의 끝
