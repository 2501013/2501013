import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("섭씨 온도(℃) 입력:");
        double c= keyboard.nextDouble();

        double f= c * 9 / 5 + 32;

        System.out.printf("해당하는 화씨 온도는 %.2f ℉ 입니다.%n",f);
    }
}