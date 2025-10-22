import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        int result;

        System.out.print("정수 2개 입력 : ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        result = num1 >= num2 ? num1 : num2;
        System.out.printf("입력한 %d와 %d 중 큰 수는 %d 입니다.%n", num1, num2, result);

        if (num1 >= num2) {
            result = num1;
        } else {
            result = num2;
        }
        System.out.printf("입력한 %d와 %d 중 큰 수는 %d 입니다.%n", num1, num2, result);

        int temp = num1 >= num2 ? 1 : 0;
        switch (temp) {
            case 1:
                result = num1;
                break;
            default:
                result = num2;
        }
        System.out.printf("입력한 %d와 %d 중 큰 수는 %d 입니다.%n", num1, num2, result);
    }
}