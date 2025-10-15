import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int RADIUS = 6378137;
        final int KDREA = 99720;
        final float PI = 3.141592f;
        float surface;
        double result;

        surface = 4 * PI * RADIUS *RADIUS / 1000;
        result = (double) KDREA / surface * 100;



        System.out.printf("지구의 반지름은 %,d \u339E 입니다.\n",RADIUS / 1000);
        System.out.printf("지구의 표면적은 %,.0f \u33a2 입니다.\n",surface);
        System.out.printf("대힌민국의 면적은 %,d \u33A2 입니다.\n",KDREA);
        System.out.printf("대한민국은 지구의 %.8f %% 입니다.\n",result);








    }
}