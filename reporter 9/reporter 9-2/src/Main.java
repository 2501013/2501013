import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int fiveHundred = 10;
        int hundred= 10;
        int month;
        int total;


        month = (500 * fiveHundred) + (100 * hundred);
        total = month * 12 * 30;

        System.out.printf("30년 동안의 총 저금액은 %d원입니다.\n", total);
    }
}

