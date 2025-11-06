//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int SAVE = 100000000;
        final int MONTH = 3000000;
        final float RATE = 5 / 100.0f;
        float deposit = SAVE;

        int month = 0;
        do {
            if (month != 0 && month % 12 == 0)
                deposit += (deposit * RATE);
            if (deposit < MONTH)
                break;
            deposit -= MONTH;
            month++;
            System.out.printf("%d달 후 잔고 : %,.0f\n", month, deposit);
        } while (true);
        System.out.printf("%d년 %d달 까지 살수가 있네요\n", month / 12, month % 12);
    }
}