//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        long money = 0L;
        long test = 0L;

        for (int day = 1; true; day++) {
            test = ((day == 1) ? 1L : (test * 2L));
            money += test;
            System.out.printf("%2d일(%,10d원) : %,12d원\n", day, test, money);
            if (money >= 100000000L)
                break;
        }

    }
}