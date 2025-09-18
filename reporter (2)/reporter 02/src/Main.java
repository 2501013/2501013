import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요: ");
        int radius = keyboard.nextInt();

        int side = radius * 2;

        double squareArea = side * side;
        double circleArea = radius * radius * Math.PI;
        double area = squareArea - circleArea;

        System.out.printf("정사각형 면적: %d cm²%n", (int)squareArea);
        System.out.printf("원의 면적: %.2f cm²%n", circleArea);
        System.out.printf("구하는 면적: %.2f cm²%n", area);

    }
}