import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int radius;
        double Volume,Area;
        final double PI = 3.141592;


        System.out.print("구의 반지름을 입력(반드시 정수로만 입력):");
        radius = keyboard.nextInt();

        Volume = (4.0 / 3.0) * PI * radius * radius * radius;
        Area = 4.0 * PI * radius * radius;


        System.out.printf("구의 부피는 %.3f 이고 표면적은 %.3f 입니다.\n",Volume,Area);

    }
}