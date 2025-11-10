//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int depth = 300;
        int up = 55;
        int down = 13;
        int day = 0;
        int height = 0;

        while (height < depth) {
            day++;
            height += up;


            if (height >= depth) {
                System.out.printf("달팽이는 %d일 만에 은달방울꽃이 시들기 전에 정상에 도착했어요. \n", day);
                break;
            } else
                height = height - down;

        }
    }
}
