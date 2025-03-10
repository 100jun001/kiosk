package lv2;

import java.util.ArrayList;
import java.util.List;
// ★List는 참조(import)해야 사용할수 있다.

public class main {
    public void main(String[] args) {
        System.out.println("hello world!");

        // List 선언 및 초기화
        List<String> list = new ArrayList<>();
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem());
        // Scanner 선언
        // ★ new(생성자)는 중복되지 않고 같은 이름으로 존재해도 각각 다른 개체이다.

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        // ★ for반복문을 이용해서 menultems의 add되는것들dmf 출력한다.
        for (int i = 0; i < menuItems.size(); i++){

        }

        // 숫자를 입력 받기
        // 입력된 숫자에 따른 처리
        // 프로그램을 종료
        // 선택한 메뉴 : 이름, 가격, 설명
    }
}
