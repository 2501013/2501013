import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        String pay;

        System.out.print("당신의 나이를 입력 :");
        age = keyboard.nextInt();

        pay = (age > 18) ? "4000원" :
                (age < 18 && age >= 13) ? "3000원" :
                        (age < 13 && age >= 7) ? "1000원" :
                                "무료";




        System.out.printf("당신의 나이는 %d 살이고 지불해야하는 요금은 총 %s 입니다.\n",age,pay);
    }
}

