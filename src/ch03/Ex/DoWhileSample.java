package ch03.Ex; // 패키지 선언문

public class DoWhileSample { // DoWhileSample 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        char c = 'a'; // char형 변수 c 선언 동시에 'a' 대입하여 초기화

        do {
            System.out.print(c); // print() 메소드 호출하여 변수 c 춫력
            c = (char) (c + 1); // 변수 c에 알파벳 다음 문자 대입
        } while(c <= 'z'); // 변수 c에 저장된 문자가 z 이전이거나 같으면 반복
    } // main() 메소드 정의 끝
} // DoWhileSample 클래스 정의 끝
