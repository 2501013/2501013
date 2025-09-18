import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // 준비물
        Scanner keyboard = new Scanner(System.in);
        String name = "";

        // 입력
        System.out.print("당신의 이름은?");
        name = keyboard.nextLine();


        // 처리


        // Information 출력 (필수)
        System.out.println("이름: " +name);

    }
}