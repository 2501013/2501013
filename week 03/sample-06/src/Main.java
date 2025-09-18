//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int time = 12000;
        int work = 5;
        int day = 7;
        int money = 25000;

        money = money + ((time * work))* day;


        System.out.printf("시간당 급여 : %c %,d\n", '\uffe6', time);
        System.out.printf("하루에 일한 시간 : %d 시간\n", work);
        System.out.printf("일한 일수 : %d\n", day);
        System.out.printf("나의 지갑의 돈 :%c %,d\n", '\uffe6', money);
    }
}