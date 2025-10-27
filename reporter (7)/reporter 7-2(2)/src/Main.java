import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        int time;
        double discount = 0;
        double finalCost;
        int cost = 10000;

        System.out.print("영화 시간 (조조 = 1, 일반 = 2) ? ");
        time = keyboard.next().charAt(0);

        System.out.print("당신의 나이?");
        age = keyboard.nextInt();

            if (time == '1') {
                discount += 0.2;
            }

        if (age >= 8 && age <= 18) {
            discount += 0.3;
        } else if (age >= 65) {
            discount += 0.4;
        }


        if (time == 2) {
            if (age >= 8 && age <= 18) {
                discount = 0.3;
            } else if (age >= 65) {
                discount = 0.4;
            } else {
                discount = 0;
            }
        }


        finalCost = cost * (1 - discount);


        System.out.println("===============================");
        System.out.printf("나이: %d\n", age);
        System.out.printf("영화 시간: %s\n", (time == 1 ? "조조" : "일반"));
        System.out.printf("할인율: %.0f%%\n", discount * 100);
        System.out.printf("결제할 요금: %.0f원\n", finalCost);
        System.out.println("===============================");
    }
}