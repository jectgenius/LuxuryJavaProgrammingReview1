package ch03.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ArrayAccess { // public으로 지정된 ArrayAccess 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스형 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        int[] intArray = new int[5]; // int형 배열에 대한 레퍼런스 변수 intArray 선언 동시에 크기가 5인 int형 배열 객체 생성하여 대입하여 초기화, 입력 받은 수 저장
        int max = 0; // int형 변수 max 선언 동시에 0 대입하여 초기화, 가장 큰 수 저장
        System.out.println("양수 5개를 입력하세요."); // println() 메소드 호출하여 입력 안내 메세지 출력
        for(int i = 0; i<5; i++) { // int형 변수 i 선언 동시에 0 대입하여 초기화 i가 5보다 작을 동안 반복, i에 +1, 즉 사용자로부터 양수 5개 입력 받음
            intArray[i] = sc.nextInt(); // intArray 배열의 인덱스 i번째 요소에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화

            if(intArray[i] > max) // 만약 변수 max에 저장된 값 보다 배열 intArray의 인덱스 i번째 요소에 저장된 값이 더 크면
                max = intArray[i]; // max에 intArray의 인덱스 i번째 요소의 값 대입, 즉 최댓값 갠신
        } // for문 끝

        System.out.print("가장 큰 수는 " + max + "입니다."); // print() 메소드 호출하여 출력

        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ArrayAccess 클래스 정의 끝
