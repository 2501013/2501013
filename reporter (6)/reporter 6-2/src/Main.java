import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int price;
        int liter;
        int total;
        int subtotal;
        float afterDiscount;
        float vat;
        float discount;


        System.out.print("주유할 리터 수를 적으시오.");
        liter = keyboard.nextInt();

        System.out.print("주유할 리터당 가격을 적으시오.");
        price = keyboard.nextInt();

        subtotal = liter * price;


        discount = ( subtotal >= 50000) ? 0.07f: 0f;

        afterDiscount = subtotal * (1 - discount);
        vat = afterDiscount * 0.1f;


        total =(int)(afterDiscount + vat);

        System.out.printf("총 금액(할인 전): %,d원\n", subtotal);
        System.out.printf("할인율: %.0f%%\n", discount * 100);
        System.out.printf("부가세: %,.0f원\n", vat);
        System.out.printf("최종 지불 금액: %,d원\n", total);


    }
}