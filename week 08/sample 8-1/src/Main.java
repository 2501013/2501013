import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // 5번 문제

        int age;
        int score;
        String result;


        System.out.print("나이 입력: ");
        age = keyboard.nextInt();

        System.out.print("점수 입력: ");
        score = keyboard.nextInt();


        result = (age >= 18 && score >= 80) ? "합격" :
                (age < 18 || score < 50) ? "불합격" : "재시험";

        System.out.printf("당신의 점수는 %d 입니다. 따라서 %s\n", score, result);
    }
}