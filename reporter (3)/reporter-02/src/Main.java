import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String sco = "경복대학교";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        float height = 170.6f;
        double weight = 65.4;


        System.out.println("********************");
        System.out.printf("  학교:%s\n", sco);
        System.out.printf("  이름:%s\n", name);
        System.out.printf("  나이:%d\n", age);
        System.out.println("  성별:" + gender);
        System.out.printf("  신장:%.1f cm%n",height);
        System.out.printf("  체중:%.1f kg%n",weight);
        System.out.println("********************");
    }
}