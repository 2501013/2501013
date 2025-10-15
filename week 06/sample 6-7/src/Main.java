import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    final int GOLD = 852000;
    final  float DON = 3.75f;
    float weight;
    float temp;
    long result;

    System.out.print("당신의 몸무게 입력:");
    weight = keyboard.nextFloat();

    temp = weight * 1000 / DON;
    result = (long) (temp * GOLD);
    result /= 1000;
    result *= 1000;



    System.out.printf("금 1돈 (%.2f g)의 가격은 %,d 원 입니다.\n",DON,GOLD);
    System.out.printf("나의 몸무게 %.1f kg(%.1f 돈)은 %,d 원 입니다.\n",weight, temp,result);
    }
}