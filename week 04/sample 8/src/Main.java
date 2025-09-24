import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int salary, bonus;
        int total, tax;

        System.out.print("월급 입력 :");
        salary = keyboard.nextInt();
        System.out.print("보너스 입력 :");
         bonus = keyboard.nextInt();

         total = salary + bonus;
         tax = (int) (total * (8.0f / 100));
         tax /= 10;
         tax *= 10;

        System.out.printf("본봉은 %,d 원\n", salary);
         System.out.printf("보너스는 %,d 원\n", bonus);


    }
}