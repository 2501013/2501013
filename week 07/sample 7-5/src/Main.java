import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1,num2;
        char result;

        System.out.print("두 정수 입력 :");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        if(num1 == 0 || num2 == 0){
            System.err.printf("%d와 %d를 곱하면 0 입니다.",num1,num2);
        }else {
            if ((num1 > 0 && num2>0) || (num1 < 0 && num2 <0)){
                result = '양';

            }else {
                result = '음';
            }

            System.out.printf("%d와 %d를 곱하면  부호는 %c수(%,d) 입니다.\n.",num1,num2,result,num1 * num2);
        }

    }
}