import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int degee;
        float result;

        System.out.print("섭씨온도 입력 :");
        degee = keyboard.nextInt();

        result = degee * (float) 9/5 + 32;


        System.out.printf("섭씨온도 %d\u2103는 화씨온도 %.2f\u2109 입니다.\n",degee,result);

    }
}