import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int salesamount;
        int vat;
        int amount;



        System.out.printf("판매금액 :");
        salesamount = keyboard.nextInt();

        vat = (int)Math.round(salesamount * 0.10);  // 총 금액 계산
        amount = salesamount + vat;

        System.out.printf("금액 : %,d 원\n", salesamount);
        System.out.printf("부가가치세: %,d원\n", vat);
        System.out.printf("총계: %,d원\n", amount);



    }
}