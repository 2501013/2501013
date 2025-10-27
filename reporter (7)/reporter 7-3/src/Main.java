import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1,num2,num3;
        float average;
        char grade;
        String result;

        System.out.print("국어,수학,영어 점수를 입력 :");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        average = (num1+num2+num3) / 3.0f ;

        if (average >= 0 && average <= 100) {
            int temp =(int) average / 10;
            switch (temp) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
                    break;
            }

            if (average >= 80) {
                result = "성적 양호";
            } else if (average >= 60) {
                result = "노력";
            } else {
                result = "성적 불량";
            }



            System.out.println("====================================");
        System.out.println("국어  영어  수학   평균   학점    결 과");
        System.out.printf("%3d  %3d  %3d  %6.2f   %c    %s\n",num1,num2,num3,average,grade,result);
        System.out.println("====================================");

        } else {
            System.out.println("입력한 점수가 유효하지 않습니다. (0~100 사이로 입력)");
        }

    }
}