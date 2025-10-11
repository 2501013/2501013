import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int amount;
        char membership;
        String result;



        System.out.print("총 구매 금액 :");
        amount = keyboard.nextInt();
        System.out.print("멤버십 회원이신가요? (Y/N)");
        membership = keyboard.next().charAt(0);


        boolean test = (amount >= 50000) ||
                ((membership == 'Y' || membership == 'y') && amount >= 30000);


        result = test ? "무료배송이 적용됩니다." : "무료배송이 적용되지 않습니다.";


        System.out.printf("총 구매 금액: %d원, 멤버십 회원: %c -> %s\n", amount, membership, result);




    }
}