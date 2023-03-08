package ch03.Ex; // 패키지 선언문

public class NestedLoop { // public으로 지정된 NestedLop 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        for(int i = 1; i<10; i++) { // int형 변수 i 선언 동시에 1 대입하여 초기화, i가 1부터 10보다 작을 동안 반복, i에 +1 즉 1~9단
            for(int j = 1; j<10; j++) { // int형 변수 j 선언 동시에 1 대입하여 초기화, j가 10보다 작을 동안 반복, j에 +1 즉 각 단의 구구단 출력
                System.out.print(i + "*" + j + "=" + i*j); // System.out.print() 메소드 호출하여 구구단 결과 출력
                System.out.print('\t'); // 탭
            }
            System.out.println(); // println() 메소드 호출하여 한 단이 끝나면 다음 줄로 줄바꿈
        } //구구단 모두 출력 끝
    } // main() 메소드 정의 끝
} // NestedLoop 크래스 정의 끝
