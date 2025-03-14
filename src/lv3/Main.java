package lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        // 검토
            //-  키오스크 프로그램을 시작하는 메서드가 구현되어야 합니다.
            // -  콘솔에 햄버거 메뉴를 출력합니다.
            //-  사용자의 입력을 받아 메뉴를 선택하거나 프로그램을 종료합니다.
            //-  유효하지 않은 입력에 대해 오류 메시지를 출력합니다.
            //-  `0`을 입력하면 프로그램이 ‘뒤로가기’되거나 ‘종료’됩니다.
        List<lv3.MenuBar> menuBars = new ArrayList<>();
        List<lv3.MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        // ★ new(생성자)는 중복되지 않고 같은 이름으로 존재해도 각각 다른 개체이다.
        menuBars.add(new MenuBar("[ SHAKESHACK MENU ]"));

        menuItems.add(new MenuItem("ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger",  6.9 ,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));


        Kiosk kiosk = new Kiosk(menuItems, menuBars); //Kiosk 객체 생성해서 menuBar 할당인데... 왜 안되냐...?
        kiosk.start();


    }
}
