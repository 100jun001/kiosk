package lv3;

import lv2.MenuBar;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //Kiosk 클래스 생성하기
        // 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리
        //menuItem 관리하는 리스트가 필드(속성, 프로퍼티(?))에 있음------start 함수 사용
        //List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당합니다.
            //Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줍니다
    // 검토
        //-  키오스크 프로그램을 시작하는 메서드가 구현되어야 합니다.------start함수 써라!!
        //-  콘솔에 햄버거 메뉴를 출력합니다.
        //-  사용자의 입력을 받아 메뉴를 선택하거나 프로그램을 종료합니다.
        //-  유효하지 않은 입력에 대해 오류 메시지를 출력합니다.
        //-  `0`을 입력하면 프로그램이 ‘뒤로가기’되거나 ‘종료’됩니다.

    //리스트 생성? 선언?
    private List<lv3.MenuItem> menuItems;
    private List<lv3.MenuBar> menuBars;

    //리스트 초기화
    public Kiosk(List<lv3.MenuItem> menuItems, List<lv3.MenuBar> menuBars){
        this.menuItems = menuItems;
        this.menuBars = menuBars;
    }

    public void start(){
        int a = 0;
        String exits = "";
        boolean flag = true;

        // Scanner 선언
        Scanner sc = new Scanner(System.in);


        do {


            //메뉴 간판
            System.out.println(menuBars.get(0).getHead());
            for (int i = 0; i < menuItems.size(); i++){

                System.out.println((i+1) + " " + menuItems.get(i).getName() + " " + menuItems.get(i).getPrice()+ " " + menuItems.get(i).getDescription());
            }


            // 숫자를 입력 받기
            try {
                a = sc.nextInt();
                sc.nextLine(); // "/n" 처리 해서 오류 방지

            }catch (InputMismatchException e){
                System.out.println("번호를 선택해주세요");
                System.out.println("");
                sc.nextLine();
                continue;
            }

            // 입력된 숫자에 따른 처리
            if (a >= 1 && a <= menuItems.size()){
                System.out.println("선택한 메뉴: " + menuItems.get(a-1).getName() + " - " + menuItems.get(a-1).getPrice() + "천원 - " + menuItems.get(a-1).getDescription());

            }else {
                System.out.println("해당하는 번호가 아님니다.");
                continue;
            }

            if (flag){
                System.out.println("다른 메뉴를 선택하시려면 enter를 눌러주세요.");
                System.out.println("종료하시려면 exit를 눌러주세요.");
                exits = sc.nextLine();
                flag = !exits.equals("exit");
            }

        }while (flag);

    }
}
