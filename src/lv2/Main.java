package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// ★List는 참조(import)해야 사용할수 있다.

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world!");

        // List 선언 및 초기화
        List<String> list = new ArrayList<>();
        List<MenuBar> menuBars = new ArrayList<>();
        List<MenuItem> menuItems = new ArrayList<>();
        int a = 0;
        String exits = "";

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        // ★ new(생성자)는 중복되지 않고 같은 이름으로 존재해도 각각 다른 개체이다.
        menuBars.add(new MenuBar("[ SHAKESHACK MENU ]"));

        menuItems.add(new MenuItem("ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger",  6.9 ,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        do {

            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            // ★ for반복문을 이용해서 menultems의 add되는것들을 출력한다.
            for (int i = 0; i < menuItems.size(); i++){
                //어떻게 출력라는거야....ㅠㅠㅠ
                //menuItem.size() = 아마 3
                //i=0
                //i=1
                //i=2
                System.out.println((i+1) + " " + menuItems.get(i).getName() + " " + menuItems.get(i).getPrice()+ " " + menuItems.get(i).getDescription());
            }

            // 숫자를 입력 받기
            try {
                a = sc.nextInt();
                sc.nextLine();
            }catch (Exception e){
                System.out.println("번호를 선택해주세요");
                System.out.println("");
                sc.nextLine();
                continue;
            }

                // 입력된 숫자에 따른 처리
            if (a == 1){
                System.out.println("선택한 메뉴: " + menuItems.get(a).getName() + " - " + menuItems.get(a).getPrice() + "천원 - " + menuItems.get(a).getDescription());
            }else if(a == 2){
                System.out.println("선택한 메뉴: " + menuItems.get(a).getName() + " - " + menuItems.get(a).getPrice() + "천원 - " + menuItems.get(a).getDescription());
            }else if(a == 3){
                System.out.println("선택한 메뉴: " + menuItems.get(a).getName() + " - " + menuItems.get(a).getPrice() + "천원 - " + menuItems.get(a).getDescription());
            }

            System.out.println("다른 메뉴를 선택하시려면 enter를 눌러주세요.");
            System.out.println("종료하시려면 exit를 눌러주세요.");
            exits = sc.nextLine();
        }while (exits == "exit");
        // 프로그램을 종료

        // 선택한 메뉴 : 이름, 가격, 설명

    }
}
