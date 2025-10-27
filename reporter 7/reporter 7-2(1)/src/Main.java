import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        String result;


        System.out.print("현재 온도(정수)를 입력 :");
        num1 = keyboard.nextInt();



        if (num1 >= 35) {
            result = "폭염경보";
        } else if (num1 >= 30 && num1 < 35) {
            result = "폭염 주의보";
        } else if (num1 >= -10 && num1 < 30) {
            result = "정상온도";
        } else {
            result = "한파 경보";
        }


        System.out.printf("현재 온도는 %d 입니다. 지금 상태는 %s 입니다.\n", num1, result);


}

    }