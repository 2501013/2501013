import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
     final int heart = 65;
     int life;
     long result;

     System.out.print("당신은 몇년 살았나요?");
     life = keyboard.nextInt();

     result = (long) life * 365 * 24 * 60 * heart;



        System.out.printf("심장은 분당 %d회 박동합니다.\n",heart);
        System.out.printf("%d년동안 살았다면 %,d 회 심장박동 했습니다.\n",life,result);
    }
}