import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int salary,expenses;
        float saveRate;
        int save, remain, money;

        System.out.print("월급을 입력하세요.(원)");
        salary = keyboard.nextInt();
        System.out.print("저축 비율을 입력하세요 (예:0.2은 20%):");
        saveRate = keyboard.nextInt();
        System.out.print("월 지출 총액을 입력하세요.(원):");
        expenses = keyboard.nextInt();

        save = (int)(salary * saveRate);

        remain = salary - save - expenses;
        money = remain / 30;


        System.out.println("\n [예산 계산 결과]");
        System.out.printf("월급 : %,d원\n",salary);
        System.out.printf("저축액 : %,d원\n",save);
        System.out.printf("지출액 : %,d원\n",expenses);
        System.out.printf("남은 금액 : %,d원\n",remain);
        System.out.printf("일일 사용 가능 예산 : %,d원\n",money);

    }
}