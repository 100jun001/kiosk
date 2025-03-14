package lv2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
// ★List는 참조(import)해야 사용할수 있다.

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world!");

        // 1. List 선언 및 초기화
        List<String> list = new ArrayList<>();
        List<MenuBar> menuBars = new ArrayList<>();
        List<MenuItem> menuItems = new ArrayList<>();
        int a = 0;
        String exits = "";
        boolean flag = true;

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
            //메뉴 간판
            System.out.println(menuBars.get(0).getHead());
            for (int i = 0; i < menuItems.size(); i++){
                //어떻게 출력라는거야....ㅠㅠㅠ
                //menuItem.size() = 아마 3
                //i=0
                //i=1
                //i=2
                System.out.println((i+1) + " " + menuItems.get(i).getName() + " " + menuItems.get(i).getPrice()+ " " + menuItems.get(i).getDescription());
            }


            // 2. 숫자를 입력 받기
            try {
                a = sc.nextInt();
                sc.nextLine(); // "/n" 처리 해서 오류 방지

            }catch (InputMismatchException e){
                System.out.println("번호를 선택해주세요");
                System.out.println("");
                sc.nextLine();
                continue;
            }

                //3.  입력된 숫자에 따른 처리
                //1주차 조원님 조언으로 코드좀 줄엿습니다. 조건을 자세히 한번에 써서 코드 줄여봤습니다.
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
                flag = !exits.equals("exit");  //여기 부분 어렵다... 내일(?) 오늘(?) 튜터님한테 질문 혹시하는데 exits가 ""로 쌓여 있어서 내용이 아닌 이름으로 인식해서 비교를 한건가?.. +그냥 ""가 문제 였습니다.. if쓸필요가 없었네요..
            }

        }while (flag);
        // 프로그램을 종료
            // 여기서 오류 == 보다는 equals사용
            //1주차 조원분의 조언의 의하면 flag라는 boolean함수를 사용하는게 나중에 좋을거라고 하셔서 추가합니다.
            //현재 새벽이라 오류 해결은 지금당장 물어볼 사람이 없어 지선생님께 도움받았습니다.
                // flag = "exit".equals("exit")는 true를 반환하기 때문에 무한 루프할수있으므로 !를 붙여서 flase를 만들어 루프를 탈출하게 만들어줘야 한다네요.
                    //는 반복문 탈출 불가현상이 나와서 머리싸메다 if문 하나더 넣으라고 해서 해봄니다..
                //list 변수는 main함수에서 사용되지 않음으로 제거해도 된다고 하는데 저건 제가 감 못잡을때 튜터님이 알려주신 감잡는 용도임니다. 그냥 저장하기로 했습니다.
                //catch문에서 exception보다는 좀더 구체적인 예외처리를 하는것을 쓰는게 좋다고 하면서 InputMismatchException을 추천해주셔서 사용해봤습니다.

        // 선택한 메뉴 : 이름, 가격, 설명

    }
}
