import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("당신의 이름은 ");
        String name = keyboard.nextLine();
        System.out.print("당신의 나이는 ");
        int age = keyboard.nextInt();

        Message message = new Message(name, age);
        message.show(name, age);
        System.out.println(message);

    }
}