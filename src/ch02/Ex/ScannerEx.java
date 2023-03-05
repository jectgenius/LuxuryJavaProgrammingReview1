package ch02.Ex; // 패키지 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ScannerEx { // public으로 선언된 클래스 ScannerEx 정의 시작
    public static void main(String[] args) { // main() 메조드 정의 시작
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요"); // println() 메소드 호출하여 입력 안내 메세지 출력
        Scanner scanner = new Scanner(System.in); // Scanner 클래스로 만든 객체에 대한 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        String name = scanner.next(); // Stirng 클래스로 만든 객체에 대한 레퍼런스 변수 name 선언 동시에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 문자열 리턴 받아 대입하여 초기화
        System.out.print("이름은 " + name + ", "); // print() 메소드 호출하여 출력
 
        String city = scanner.next(); // String 클래스로 만든 객체에 대한 레퍼런스 변수 city 선언 동시에 scanenr 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 문자열 리턴 받아 대입하여 초기화
        System.out.print("도시는 " + city + ", "); // print() 메소드 호출하여 출력

        int age = scanner.nextInt(); // int형 변수 age 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화
        System.out.print("나이는 " + age + "살, "); // print() 메소드 호출하여 출력

        double weight = scanner.nextDouble(); // double형 변수 weight 선언 동시에 scanner 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 실수를 리턴 받아 대입하여 초기화
        System.out.print("체중은 " + weight + "kg, "); // print() 메소드 호출하여 출력

        boolean isSingle = scanner.nextBoolean(); // boolean형 변수 isSingle 선언 동시에 scanner 객체의 nextBoolean() 메소드 호출하여 사용자로부터 입력 받은 논리값을 리턴 받아 대입하여 초기화
        System.out.println("독신 여부는 " + isSingle + "입니다."); // println() 메소드 호출하여 출력

        scanner.close(); // scanner 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ScannerEx 클래스 정의 끝
