package lv1;

import java.util.Scanner;

public class Kiosk1b {

//    [ SHAKESHACK MENU ]
//  1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
//  2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
//  3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
//  4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
//  0. 종료      | 종료
//  0 <- // 0을 입력
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");
            // 메뉴판

            try {
                a = sc.nextInt();
                sc.nextLine();
                // 입력

            }catch (Exception e){
                System.out.println("숫자로 입력해주세요!");
                System.out.println("");
                sc.nextLine();
                continue;
            }
            //try catch로 오류 잡기


            if (a == 1) {
                System.out.println("1. ShackBurger 선택되었습니다.");
                System.out.println("");
                // 1번 선택에 대한 메시지

            } else if (a == 2) {
                System.out.println("2. SmokeShack 선택되었습니다.");
                System.out.println("");
                // 2번 선택에 대한 메시지

            } else if (a == 3) {
                System.out.println("3. Cheeseburger 선택되었습니다.");
                System.out.println("");
                // 3번 선택에 대한 메시지

            } else if (a == 4) {
                System.out.println("4. Hamburger 선택되었습니다.");
                System.out.println();
                // 4번 선택에 대한 메시지

            } else if (a > 4) {
                System.out.println("해당하는 번호가 없습니다.");
                System.out.println();
                // 4이상의 숫자 입력시 해당하는 번호 없음 출력으로 알림

            } else if (a < 0) {
                System.out.println("해당하는 번호가 없습니다.");
                System.out.println();
                // 0이하의 숫자 입력시 해당하는 번호 없음 출력으로 알림

            } else {
                break;
                // 0입력시 반복문 종료
            }

        }
    }
}
