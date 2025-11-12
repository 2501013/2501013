import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text;
        char[] convert;

        System.out.print("영 문장 입력 : ");
        text = keyboard.nextLine();

        convert = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                convert[i] = (char) (text.charAt(i) - 32);
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                convert[i] = (char) (text.charAt(i) + 32);
            } else {
                convert[i] = text.charAt(i);
            }
        }

        System.out.printf("원문 : %s\n", text);
        System.out.printf("변환 : %s\n", new String(convert));

    }
}