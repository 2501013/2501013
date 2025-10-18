import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int TICKET = 4500;
        int ticket;
        float discount;
        int total;


        System.out.print("식권을 몇 장 구매하시나요?");
        ticket = keyboard.nextInt();

        discount = (ticket >= 30) ? 0.20f:
                   (ticket >= 20) ? 0.15f :
                           (ticket >= 10) ? 0.1f:
                           0f;




        total = (int) (TICKET * ticket * (1 - discount ));


        System.out.printf("%d장 구매하였어 %.0f%% 할인 적용 되어 총 가격 입니다.\n",ticket,discount * 100);
        System.out.printf("지불해야하는 금액 : %,d\n",total);
    }
}