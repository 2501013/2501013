import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double time;
        int day,hour, minute, second;

        System.out.print("시간 입력:");
        time = keyboard.nextDouble();

        int totalSeconds = (int)(time * 3600);

        day = totalSeconds / (24 * 3600);
        hour = (totalSeconds % (24 * 3600)) / 3600;
        minute = (totalSeconds % 3600) / 60;
        second = (totalSeconds % 60);



        System.out.printf("%.2f 시간은 %d 일 %d 시간 %d 분 %d초 입니다.\n",time,day,hour, minute, second);
    }
}