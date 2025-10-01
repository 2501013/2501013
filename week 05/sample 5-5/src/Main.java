import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int date = 0;
        String result = "";


        System.out.print("양의 정수 입력: ");
        date = keyboard.nextInt();

        result = ((date % 2) == 0) ? "짝수" : "홀수";






        System.out.printf("%d는 %s 입니다.\n",date,result);
    }
}