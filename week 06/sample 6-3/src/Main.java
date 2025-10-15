//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    final int LIGHT = 300000;
    final int YEAR = 365;
    int second;
    long result;

    second = YEAR *24*60*60;
    result = (long) LIGHT * second;


    System.out.printf("빛의 속도는 1초당 %,d \u33a2 입니다.\n",LIGHT);
    System.out.printf("1년은 %,d 초 입니다.\n",second);
        System.out.printf("빛이 1년간 간 거리는 %,d \u33a2 입니다.\n",result);
    }
}