package ch03.Ex; // ch03 패키지의 Ex 패키지에 포함, 패키지 선언문

public class ForeachEx { // public으로 지정된 클래스 ForeachEx 정의 시작
    enum Week {월, 화, 수, 목, 금, 토, 일} // 열거형 Week 정의

    public static void main(String[] args) { // main() 메소드 정의 시작
        int[] n = {1, 2, 3, 4, 5}; // int형 배열에 대한 레퍼런스 변수 n 선언 동시에 값 초기화하여 대입하여 초기화
        String[] names = {"사과", "배", "바나나", "쳬리", "딸기", "포도"}; // String형 배열에 대한 레퍼런스 변수 names 선언 동시에 값 초기화하여 대입하여 초기화

        int sum = 0; // int형 변수 sum 선언 동시에 0 대입하여 초기화
        for(int k : n) { // int형 변수 k에 배열 n의 모든 요소가 순서대로 할당될 동안 반복
            System.out.print(k + " "); // print() 메소드 호출하여 k 출력
            sum += k; // sum에 +k
        } // for-each문 끝
        System.out.println("합은" +sum); // println() 메소드 호출하여 배열에 저장된 모든 수의 합 출력

        for(String s : names) // String 클래스형 레퍼런스 변수 s에 배열 names의 모든 요소가 순서대로 할당될 동안 본복
            System.out.print(s + " "); // print() 메소드 호출하여 s 출력
        System.out.println(); // println() 메소듷 호출하여 줄바꿈

        for(Week day : Week.values()) // Week 열거험 레퍼런스 변수 day에 열거헝 Week의 values() 메소드를 호출하여 리턴 받은 배열의 모든 요소가 순서대로 할당될 동안 본복
            System.out.print(day + " "); // print() 메소드 호출하여 day 출력
        System.out.println(); // println() 메소드 호출하여 줄바꿈
    } // main() 메소드 정의 끝
} // ForeachEx 클래스 정의 끝
