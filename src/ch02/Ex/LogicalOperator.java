package ch02.Ex; // 패키지 선언문

public class LogicalOperator { // public으로 선언된 클래스 LogicalOpertor 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작

        System.out.println('a' > 'b'); // 문자 a가 b보다 유니코드가 더 크다. pirntln() 메소드 호출하여 연산 결과 출력, 사전 순서가 앞 일수록 유니코드가 더 작다.
        System.out.println(3 >= 2); // 3이 2보다 크거나 갇다.
        System.out.println(-1 < 0); // -1이 0보다 작다.
        System.out.println(3.45 <= 2); // 3.45가 2보다 작거나 같다.
        System.out.println(3 == 2); // 3과 2는 같다.
        System.out.println(3 != 2); // 3과 2는 같지 않다.
        System.out.println(!(3 != 2)); // 3과 2는 같지 않지 않다. 즉 같다.

        // 비교 연산과 논리 연산 복합
        System.out.println((3 > 2) && (3 > 4)); // 3은 2보다 크고 3은 4보다 크다.
        System.out.println((3 != 2) || (-1 > 0)); // 3과 2는 같지 않거나 -1은 0보다 크다.
        System.out.println((3 != 2) ^ (-1 > 0)); // 3과 2는 같지 않다. XOR -1은 0보다 크다.
    } // main() 메소드 정의 끝
} // LogicalOperator 클래스 정의 끝
