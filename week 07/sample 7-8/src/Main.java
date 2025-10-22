import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int salary;
        int tax;

        System.out.print("금여액 입력 (1 ~ 30,000,000) : ");
        salary = keyboard.nextInt();

        if (salary > 0 && salary <= 30000000) {
            if (salary < 2000000) {
                tax = 0;
            } else if (salary <= 4000000) {
                tax = (int) ((salary - 2000000) * (10.0f / 100));
            } else if (salary <= 6000000) {
                tax = (int) ((salary - 2000000) * (8.0f / 100));
            } else if (salary <= 20000000) {
                tax = (int) ((salary - 2000000) * (6.0f / 100));
            } else {
                tax = (int) ((salary - 2000000) * (5.0f / 100));
            }

            System.out.printf("급여액 %,d원이면, 세금은 %,d원 입니다.\n", salary, tax);
        } else {
            System.err.println("ERROR : 금여액이 이상하네");
        }



    }
}

