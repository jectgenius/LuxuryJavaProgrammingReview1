package ch02.Exercise; // 패키진 선언문

import java.util.Scanner; // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ch2_8 { // public으로 지정된 클래스 ch2_8 정의 시작
    public static boolean inRect(int x1, int y1, int x2, int y2, int rectx1, int recty1, int rectx2, int recty2) { // inRect() 메소드 정의 시작, 두 직사각형이 서로 충돌하는지 판단
        if((x1 < rectx1 && x2 < rectx1) || (x1 > rectx2 && x2 > rectx2)) { // 만약 x 기준 입력 받은 두 점 모두 직사각형의 작은 점보다 작거나 큰 점보다 큰 경우
            return false; // y 상관 없이 충돌하지 않는다.
        }
        else { // x 기준 위의 조건이 거짓인 경우
            if((y1 < recty1 && y2 < recty2) || (y1 > recty2 && y2 > recty2)) { // y기준 입력 받은 두 점 모두 직사각형의 작은 점 보다 작거나 큰 점보다 커야한다.
                return false;
            }
        }
        return true; // 2가지 경우에 속하지 않으면 두 직사각형은 충돌한다.
    } // inRect() 메소드 정의 끝

    public static void main(String[] args) { // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in); // Scanner 클래스로 만든 겍체에 대한 레퍼런스 변수 sc 선언 동시에 Scanner 클래스로 만든 객체 생성하여 대입하여 초기화

        System.out.print("점 (x1, y1), (x2, y2)의 좌표를 입력하시오>>"); // print() 메소드 호출하여 입력 안내 메세지 출력
        int x1 = sc.nextInt(); // int형 변수 x1 선언 동시에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 리턴 받아 대입하여 초기화, 사용자가 입력한 직사각형의 x1 좌표
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int rectx1 = 100; // int형 변수 rectx1 선언 동시에 100 대입하여 초기화,
        int recty1 = 100;
        int rectx2 = 200;
        int recty2 = 200;

        if(inRect(x1, y1, x2, y2, rectx1, recty1, rectx2, recty2) == true) { // 만약 inRect() 메소드 호출하여 리턴 받은 값이 true인 경우 두 직사각형은 충돌한다.
            System.out.println("이 직사각형은 충돌합니다."); // println() 메소드 호출하여 출력
        }
        else { // 그렇지 않으면, 즉 false인 경우 두 직사각형은 충돌하지 않는다.
            System.out.println("이 직사각형은 충돌하지 않습니다."); // println() 메소드 호출하여 출력
        }

        sc.close(); // sc 객체의 close() 메소드 호출하여 닫기
    } // main() 메소드 정의 끝
} // ch2_8 클래스 정의 끝
