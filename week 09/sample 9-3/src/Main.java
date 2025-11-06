import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        final int count = 5;
        int grade;
        int total = 0;
        float avg;

        for (int i = 1; i <= count; ) {
            System.out.printf("%d번 학생 성적 입력: ", i);
            grade = keyboard.nextInt();

            if (grade >= 0 && grade <= 100) {
                total += grade;
                i++;
            } else {
                System.err.println("ERROR: 성적은 0 ~ 100 사이여야 합니다.\n");
                System.in.read();
            }
        }

        avg = (float) total / count;

        System.out.printf("\n총점 : %,d 점\n", total);
        System.out.printf("평균 : %.2f 점\n", avg);
    }
}