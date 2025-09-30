import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int AREA = 56000;
        int area;
        int price;
         System.out.printf("면적 입력 : (단, 1평 단가 = 56,000 원 이고,가격은 1,000원 미만은 버린다)");
          area = keyboard.nextInt();;

          price = area * AREA;

          price = (price / 1000) * 1000;



        System.out.printf("주택지의 총 가격: %,d 원\n", price);
    }
}