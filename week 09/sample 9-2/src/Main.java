import java.io.IO;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int start;
        int last;
        int sum = 0;

        while (true) {
            System.out.print("어디서부터 더할까요? ");
            start = keyboard.nextInt();
            System.out.print("어디서까지 더할까요? ");
            last = keyboard.nextInt();

            if (start < last) {
                break;
            } else {
                System.err.println("ERROR: 시작값은 끝값보다 작아야 합니다.\n");
                System.in.read();
            }
        }

        for (int i = start; i <= last; i++) {
            sum += i;
        }

        System.out.printf("%d부터 %d까지의 합은 %,d입니다.\n", start, last, sum);
    }
}