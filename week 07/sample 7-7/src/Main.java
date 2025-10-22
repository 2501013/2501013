import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hours;
        String result;
        int salary;
        int extraPay;
        int PAY = 9620;

        System.out.print("주당 아르바이트 시간 입력: ");
        hours = keyboard.nextInt();

        if (hours > 0) {
            if (hours > 40) {
                salary = 40 * PAY;
                extraPay = (hours - 40) * (int)(PAY * 1.5);
                result = String.format("수당: %,d원, 급여: %,d원, 합계: %,d원",
                        extraPay, salary, extraPay + salary);
            } else {
                salary = hours * PAY;
                result = String.format("급여: %,d원", salary);
            }

            System.out.printf("시간당 임금: %,d원\n", PAY);
            System.out.printf("주당 %d시간 아르바이트 결과: %s\n", hours, result);
        } else {
            System.err.println("아르바이트 안했네");
        }


    }
}