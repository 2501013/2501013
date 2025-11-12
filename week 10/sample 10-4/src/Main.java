import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int SIZE = 6;
        int[] lotto = new int[SIZE];
        boolean flag = false;

        int i = 0;
        while (i < lotto.length) {
            lotto[i] = random.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    //          System.err.println("중복 발생");
                    flag = true;
                    break;
                }
            }

            if (flag) {
                flag = false;
            } else {
                i++;
            }
        }

        System.out.print("Lotto : ");
        for (i = 0; i < lotto.length; i++)
            System.out.printf("%2d, ", lotto[i]);
        System.out.printf("\b\b");
    }
}