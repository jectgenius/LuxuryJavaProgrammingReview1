package ch03.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명을 알려줌

public class WhileSample { // WhileSample 클래스 정의 시작
    public static void main(String[]  args) { // main() 메소드 정의 시작
        int count = 0; // int형 변수 count 선언 동시에 0 대입하여 초기화
        int sum = 0; // int형 변수 sum 선언 동시에 0 대입하여 초기화

        Scanner sc = new Scanner(System.in); // Scanner 클래스형 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요."); // println() 메소드 호출하여 입력 안내 메세지 출력
        int n = sc.nextInt(); // int형 변수 n 선언 동시에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        while(n != -1) { // n이 -1이 아니면, 즉 사용자가 -1 이외의 수를 입력하면
            sum += n; // sum에 +n, 즉 사용자가 입력한 줭수를 sum에 더함
            count++; // count에 +1, 즉 사용자가 입력한 수의 개수 +1
            n = sc.nextInt(); // n에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        } // while문 끝

        if(count == 0) // 만약 count가 0이면, 즉 사용자가 입력한 수가 0개이면
            System.out.println("입력된 수가 없습니다."); // println() 메소드 호출하여 출력
        else { // 그렇지 않으면, 즉 사용자가 입력한 수가 0개가 아니면
            System.out.print("정수의 개수는 " + count + "개이며 "); // print() 메소드 호출하여 정수의 개수 출력
            System.out.println("평균은 " + (double)sum/count + "입니다."); // println() 메소드 호출하여 평균 출력
        }

        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // WhileSample 클래스 정의 끝
