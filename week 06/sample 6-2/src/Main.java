//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final float YEAR = 365.2422f;
        int day;
        int hour;
        int minute;
        int second;

        float temp = YEAR;

        day = (int) temp;
        temp -= day;
        temp *= 24;
        hour = (int) temp;

        temp -= hour;
        temp *= 60;
        minute = (int) temp;

        temp -= minute;
        temp *= 60;
        second = (int) temp;

        System.out.printf("1년은 %.4f일 입니다.\n", YEAR);
        System.out.printf("\t%d 일\n\t%d 시간\n\t%d 분\n\t%d 초\n", day, hour, minute, second);

    }
}