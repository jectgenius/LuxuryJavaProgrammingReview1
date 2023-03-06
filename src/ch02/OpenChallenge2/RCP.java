package ch02.OpenChallenge2; // 패키지 선언문


import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class RCP { // public으로 지정된 RCP 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 헤퍼런스 변수 scanner 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요"); // println() 메소드 호출하여 입력 안내 메세지 출력
        System.out.print("철수 >> "); // print() 메소드 호출하여 철수 입력 안내 메세지 출력
        String chulsu = scanner.next(); // String 클래스로 만든 객체에 대한 레퍼헌스 변수 chulu 선언 동시에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 문자열 리턴 받아 대입하여 초기화
        System.out.print("영희 >> "); // print() 메소드 호출하여 영희 안내 메세지 출력
        String younghee = scanner.next(); // String 클래스로 만든 객체에 대한 레퍼헌스 변수 younghee 선언 동시에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 문자열 리턴 받아 대입하여 초기화

        if(chulsu.equals(younghee)) { // 만약 chulsu와 younghee에 저장된 문자열의 내용이 같다면, 즉 철수와 영희가 같은 것을 냈다면
            System.out.println("비겼습니다."); // println() 메소드 호출하여 비겼습니다. 출력
        }
        else { // 그렇지 않으면
            if(chulsu.equals("가위") && younghee.equals("보")) // 철수가 가위를 냈고, 영희가 보를 냈다면
                System.out.println("철수가 이겼습니다."); // println() 메소드 호출하여 철수가 이겼습니다. 출력
            if(chulsu.equals("보") && younghee.equals("가위")) // 철수가 보를 냈고, 영희가 가위를 냈다면
                System.out.println("영희가 이겼습니다."); // println() 메소드 호출하여 영희가 이겼습니다. 출력
            if(chulsu.equals("바위") && younghee.equals("가위")) // 철수가 바위를 냈고 영희가 가위를 냈다면
                System.out.println("철수가 이겼습니다."); // println() 메소드 호출하여 철수가 이겼습니다. 출력
            if(chulsu.equals("가위") && younghee.equals("바위")) // 철수가 가위를 냈고 영희가 바위를 냈다면
                System.out.println("영희가 이겼습니다."); // println() 메소드 호출하여 영희가 이겼습니다. 출력
            if(chulsu.equals("보") && younghee.equals("바위")) // 철수가 보를 냈고 영희가 바위를 냈다면
                System.out.println("철수가 이겼습니다."); // println() 메소드 호춣하여 철수가 이겼습니다. 출력
            if(chulsu.equals("바위") && younghee.equals("보")) // 철수가 바위를 냈고 영희가 보를 냈다면
                System.out.println("영희가 이겼습니다."); // println() 메소드 호출하여 영희가 이겼습니다. 출력
        }
        // 가위 바위 보 게임 결과 출력 끝
        scanner.close(); // scanner 객체의 close() 메소드 호추하여 닫기
    } // main() 메소드 정의 끝
} // RCP 클래스 정의 끝
