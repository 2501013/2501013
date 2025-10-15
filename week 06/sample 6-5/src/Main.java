import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       final int MACH =340;
       float fighter;
       int result;

       System.out.print("우리 전투기의 속도는 ?");
       fighter = keyboard.nextFloat();

       result = (int) ((fighter * MACH  * 365 * 24 * 60 * 60 ) / 1000) ;



       System.out.printf("1 마라는 초당 %d m를 이동합니다.\n",MACH);
       System.out.printf("%.1f 마하인 전투기가 1년간 간 거리는 %,d \u33a2 입니다.\n ",fighter,result);





    }
}