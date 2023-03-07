package ch03.Ex; // 패키지 선언문

public class ForSample { // public으로 지정된 ForSample 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        int sum = 0; // int형 변수 sum 선언 동시에 0 대입하여 초기화

        for(int i = 1; i <= 10; i++) { // int형 변수 i 선언 동시에 1로 대입하여 초기화, i가 10보다 작거나 같을 동안 반복, i에 +1
            sum += i; // sum에 +i
            System.out.print(i); // print() 메소드 호출하여 변수 i 출력

            if(i <= 9) { // 만약 i가 9보다 작거나 같으면
                System.out.print("+"); // print() 메소드 호출하여 + 출력
            }
            else { // 그렇지 않으면, 즉 i가 10이면
                System.out.print("="); // print() 메소드 호출하여 = 출력
                System.out.println(sum); // println() 메소드 호출하여 sum 출력
            }
        }// for문 끝
    } // main() 메소드 정의 끝
} // ForSample 클래스 정의 끝
