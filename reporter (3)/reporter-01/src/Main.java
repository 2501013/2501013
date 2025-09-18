import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int byte1 = 0;
        int byte2 = 0;

System.out.print("첫번째 숫자를 입력하세요.");
String input1 = keyboard.nextLine();
        byte1 = Integer.parseInt(input1);

        System.out.print("두번째 숫자를 입력하세요.");
        String input2 = keyboard.nextLine();
        byte2 = Integer.parseInt(input2);



        long result =  (byte1 + byte2);

        System.out.printf("%d + %d = %d\n", byte1, byte2, result);
    }
}