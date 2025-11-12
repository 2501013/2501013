import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard =  new Scanner(System.in);
        int[] ip = new int[4];
        int nogood = 0;
        int totalVotes = 0;
        int xdata;

        System.out.println("투표를 시작합니다 (1~4번 중 후보 번호 입력)");
        System.out.println("입력을 끝내려면 숫자 외의 값을 입력하세요.");

        while (true) {


            if (!keyboard.hasNextInt()) {
                System.out.println("\n더 이상 입력이 없어 투표가 종료됩니다.");
                break;
            }

            xdata = keyboard.nextInt();
            totalVotes++;

            if (xdata >= 1 && xdata <= 4) {
                ip[xdata - 1]++;
            } else {
                nogood++;
            }
        }

        System.out.println("\n--- 투표 개표 결과 ---");
        for (int i = 0; i < ip.length; i++) {
            System.out.printf("%d번 후보 : %d표\n", i + 1, ip[i]);
        }
        System.out.printf("무효표 : %d표\n", nogood);
        System.out.printf("총 투표수 : %d표\n", totalVotes);
        System.out.println("----------------------");
    }
}