package ch02.Ex; // 패키지 선언문

public class AssignmentIncDecOpertor { // public으로 선언된 클래스 AssignmentIncDecOperator 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        int a=3, b=3, c=3; // int형 변수 a 선언 동시에 3 대입하여 초기화, b 선언 동시에 3 대입하여 초기화, c 선언 동시에 3 대입하여 초기화

        a += 3; // a = a + 3
        b *= 3; // b = b * 3
        c %= 2; // c = c % 2
        System.out.println("a=" + a + ", b=" + b + ", c=" + c); // println() 메소드 호출하여 출력

        int d=3; // int형 변수 d 선언 동시에 3 대입하여 초기화

        a = d++; // a에 d 대입 후 d에 +1
        System.out.println("a=" + a + ", d=" + d);
        a = ++d; // d에 +1 후 a에 d 대입
        System.out.println("a=" + a + ", d=" + d);
        a = d--; // a에 d 대입 후 d에 -1
        System.out.println("a=" + a + ", d=" + d);
        a = --d; // d에 -1 후 a에 d 대입
        System.out.println("a=" + a + ", d=" + d);

    } // main() 메소드 정의 끝
} // AssignmentIncDecOperator 클래스 정의 끝
