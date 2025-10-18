import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String AGE;
        String cardType;
        String night;
        int age;
        char card;
        int time;
        int price;
        int finalprice;
        int basePrice;

        System.out.print("당신의 나이는?");
        age = keyboard.nextInt();

        System.out.print("교통카드 사용 여부 (사용 = Y | 미사용= N) 입력 : ");
        card = keyboard.next().charAt(0);

        System.out.print("탑승 시간을 입력하세요.");
        time = keyboard.nextInt();

        AGE = (age >= 20) ? "성인":
                (age >= 9) ? "청소년": "어린이";

        cardType = (card == 'Y' || card == 'y') ? "교통카드" : "현금";

        basePrice = (AGE.equals("성인")) ? ((card == 'Y' || card == 'y') ? 1250 : 1350)
                : (AGE.equals("청소년")) ? ((card == 'Y' || card == 'y') ? 750 : 850)
                : 450;

        night = (time >= 22 || time <= 5) ? "심야 요금 20% 적용" : "심야 아님";

        finalprice = (time >= 22 || time <= 5) ? (int)(basePrice * 1.2) : basePrice;



        System.out.println("--------- 탑승 요금 안내 ---------");
        System.out.printf("나이: %d (%s)\n", age, AGE);
        System.out.printf("결제 방법: %s\n", cardType);
        System.out.printf("기본 요금: %,d원\n", basePrice);
        System.out.printf("탑승 시간: %d시 (%s)\n", time, night);
        System.out.printf("최종 지불 금액: %,d원\n", finalprice);
        System.out.println("---------------------------------");






    }
}