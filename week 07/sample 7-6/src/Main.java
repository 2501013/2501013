import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int a, b, c;
        String result;
        double s;
        double area;

        System.out.print("삼각형의 세변의 길이 입력 : ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if ((a > 0 && b > 0 && c > 0) && (a + b > c && b + c > a && c + a > b)) {
            s = (a + b + c) / 2.0;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            result = String.format("삼각형의 넓이 : %.2f ㎠", area);
        } else {
            result = "삼각형을 만들 수가 없습니다.";
        }

        System.out.printf("세변의 길이 %dcm, %dcm, %dcm이면, %s%n", a, b, c, result);
    }
}






