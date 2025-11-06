import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

   for (int i = 1; i <= 10; i++) {
            System.out.printf("%d I love you.\n", i);
        }

        System.out.println();


        int j = 1;
        while (j <= 10) {
            System.out.printf("%d I love you.\n", j++);
        }

        System.out.println();


        int k = 1;
        do {
            System.out.printf("%d I love you.\n", k++);
        } while (k <= 10);
    }
}