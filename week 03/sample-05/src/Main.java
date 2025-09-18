import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float litter = 0.0f;
        float Km = 0.0f;
        float result = 0.0f;

        System.out.print("사용 연료 량 입력 :");
        litter = keyboard.nextFloat();

        System.out.printf("운행 거리 입력 :");
        Km = keyboard.nextFloat();
        System.out.printf("사용 연료 량 : %.2f %c\n",litter, '\u2113');
        System.out.printf("운행 거리 : %.2f Km\n", Km);
        System.out.printf("연비 : %,2f Km/%c\n", result, '\u2113');
    }
}