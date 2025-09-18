import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner keyboard = new Scanner(System.in);
        String name ="";
        short age = 0;

        System.out.println("당신의 이름은?");
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는?", name);
        age = keyboard.nextShort();


        System.out.printf("%s님의 나이는 %d살 입니다.\n",name,age);
    }
}