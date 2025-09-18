import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        short age = 0;
        double weight = 0.0;
        float height = 0.0f;

        System.out.print("나이,체중,신장을 빈칸으로 분리하여 순서대로 입력하세요");
        age = keyboard.nextShort();
        weight = keyboard.nextDouble();
        height = keyboard.nextFloat();

        System.out.printf("\n당신의 나이는 %d살 입니다.\n", age);
        System.out.printf("당신의 몸무게는 %.1f kg 입니다.\n", weight);
        System.out.printf("당신의 키는 %.1f Cm 입니다.\n", height);

    }
}