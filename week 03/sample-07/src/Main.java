//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final  int SPEED = 30000;
        final  float YEAR = 365.25f;
        long light = 0L;
        double light1 = 0.0f;

        light = SPEED * (long) (((YEAR * 24) * 60) * 60);
        light1 = SPEED * (((YEAR * 24) * 60) * 60);


        System.out.printf("빛이 1초동안 가는 거리 : %,d Km/s\n", SPEED);
        System.out.printf("1년은 %.2f 일\n", YEAR);
        System.out.printf("1광년 : %,d Km\n", light);
        System.out.printf("1광년 : %,d Km\n", (long) light1);
    }
}