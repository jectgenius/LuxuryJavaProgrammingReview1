package ch03.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ArrayLength { // public으로 지정된 ArrayLength 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        int[] intArray = new int[5]; // int형 배열에대한 레퍼런스 변수 intArray 선언 동시에 크기가 5인 int형 배열 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받은 정수 저장
        int sum = 0; // int형 변수 sum 선언 동시에 0 대입하여 초기화, 배열의 크기만큼의 수의 합 저장

        Scanner sc = new Scanner(System.in); // Scanner 클래스형 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화
        System.out.print(intArray.length + "개의 정수를 입력하세요>> "); // print() 메소드 호출하여 배열의 크기 만큼의 정수 입력 안내 메세지 출력
        for(int i = 0; i<intArray.length; i++) { // int형 변수 i 선어 동시에 0대입하여 초기화, i가 배열의 크기보다 작을 동안 반복, i에 +1, 즉 배열의 크기만큼 사용자로부터 정수 입력 받음
            intArray[i] = sc.nextInt(); // 배열 intArray의 인덱스 i번째 요소에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화
            sum += intArray[i]; // sum에 +intArray[i]
        } // for문 끝

        System.out.print("평균은 " + (double)sum/intArray.length); // print() 메소드 호출하여 평균 출력

        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ArrayLength 클래스 정의 끝
