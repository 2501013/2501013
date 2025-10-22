import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        int result;

        System.out.print("10진 정수 입력 (1  ~ 9999) :");
        num = keyboard.nextInt();

        if (num >= 1 && num <= 9999) {
            if (num >= 1000){
                result = 9999 - num + 1;
            } else if (num >= 100){
                result = 999 - num + 1;
            } else if (num >= 10){
                result = 99 - num + 1;
            } else {
                result = 9 - num + 1;
            }


            System.out.printf("10진수 %d의 10의 보수는 %,d 입니다.%n", num, result);

        } else {
            System.out.println("ERROR : 입력 값은 1 ~ 9999 입니다.");
        }
    }
}