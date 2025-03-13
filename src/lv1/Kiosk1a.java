package lv1;

import java.util.Scanner;

public class Kiosk1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startnum1 = 0;
        int menu = 0;
        char menuList = 'a';
        int menuListA = 0;
        int menuListB = 0;
        int menuListC = 0;
        int menuListD = 0;
        int menuListE = 0;
        int menuListF = 0;
        String exit = "";
        boolean flag = true;

        do {

            //  0. 음식점 키오스크
            try {

                //  1. 입력
                System.out.println("주문하시려면 0번을 눌러주세요.");
                startnum1 = sc.nextInt();
                sc.nextLine();

                //  2. 출력
                if (startnum1 == 0) {

                    menu1();
                    menuCount0();
                    // 처음 메뉴고르는 화면(어떻게 바꿀지 모르겠어.. 머리가 넘모 아파...)

                    menu = sc.nextInt();
                    sc.nextLine();
                    // 메뉴 선택

                    if (menu == 1) {
                        menuNum1();
                        menuCount0();
                        // 메뉴의 리스트 보기

                        menuList = sc.nextLine().charAt(0);
                        // 메뉴의 리스트 A, B선택
                        // (이게 맞는걸까.... 머리 넘모 아퍼...)

                        if (menuList == 'a' || menuList == 'A'){
                            menuNum1();
                            menuCount1();
                            // 설명 햄부거 하나만 고르시오!
                            // -웨... 간단한건데 왜 이리 머리가 아픈걸까.. 난 바부야...
                            // 피드백 -> 바부 마따.. 또 따라하라니까 앞에만 읽고 혼자해버리고
                            // 혼자 설계를 제대로 안하고 만드니 힘들지!

                            menuListA = sc.nextInt();

                        } else if (menuList == 'b' || menuList == 'B') {
                            menuNum1();
                            menuCount2();

                        }
                    }else if (menu == 2){

                    }else if (menu == 3){

                    }else {
                        exit = sc.nextLine();
                        flag = !"exit".equals(exit);
                    }
                }else{
                    System.out.println("세상이 돌아간다~");
                    continue;
                }


            } catch (Exception e) {
                System.out.println("세상이 돌아가네~");
            }


            exit = sc.nextLine();
            flag = !"exit".equals(exit);
        } while (flag);
    }

    //  3. 메뉴 관리
    private static void menu1() {
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println("☆★☆★☆ 1.메인메뉴 ★☆★☆★ 2.사이드메뉴 ★☆★☆★ 3.음료 ★☆★☆★");
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
    }

    private static void menuNum1() {
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println("☆★ A-나폴리맛피아버거 : 3000 ☆★☆★☆  B-에드워드리버거 : 3500 ★☆");
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
    }

    private static void menuNum2() {
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println("☆★☆★☆ A-프렌치 프라이 :  500 ☆★☆★  B-초코 콘 :  900 ☆★☆★☆");
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
    }

    private static void menuNum3() {
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println("☆★☆★☆★☆ A-사이다 : 1500 ★☆★☆★☆  B-콜라 : 2000 ★☆★☆★☆");
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
    }

    private static void menuCount0() {
        System.out.println("☆★                                                      ★☆");
        System.out.println("☆★                ↑ 이제부터 고르실 메뉴의 ↑                 ★☆");
        System.out.println("☆★              ↑  번호, 타입을 눌러주세요. ↑                ★☆");
        System.out.println("☆★                                                      ★☆");
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
    }

    private static void menuCount1() {
        System.out.println("☆★                                                      ★☆");
        System.out.println("☆★           주문하실 메뉴 A의 구매수량을 정해주세요.           ★☆");
        System.out.println("☆★                                                      ★☆");
        System.out.println("☆★                                                      ★☆");
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
    }

    private static void menuCount2() {
        System.out.println("☆★                                                      ★☆");
        System.out.println("☆★           주문하실 메뉴 B의 구매수량을 정해주세요.           ★☆");
        System.out.println("☆★                                                      ★☆");
        System.out.println("☆★                                                      ★☆");
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
    }

    private static void count(){

        int a = 0;
    }
}