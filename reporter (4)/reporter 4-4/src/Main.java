import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int OneDollar;
        int Half;
        int Quarter;
        int Dime;
        int Nickel;
        int Penny;
        int total;

        System.out.print("달러 개수:");
        OneDollar = keyboard.nextInt();

        System.out.print("하프 개수:");
        Half = keyboard.nextInt();

        System.out.print("쿼터 개수:");
        Quarter = keyboard.nextInt();

        System.out.print("다임 개수:");
        Dime = keyboard.nextInt();

        System.out.print("니켈 개수:");
        Nickel = keyboard.nextInt();

        System.out.print("페니 개수:");
        Penny = keyboard.nextInt();

        total = (OneDollar * 100) + (Half * 50) + (Quarter * 25) + (Dime * 10) +
                (Nickel * 5) + (Penny * 1);

        System.out.printf("총금액 %d 입니다.\n",total);


    }
}