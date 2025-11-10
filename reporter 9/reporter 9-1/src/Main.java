//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* int chicken, dog;
        for (chicken = 0; chicken <= 37; chicken++) {
            dog = 37 - chicken;
            if (2 * chicken + 4 * dog == 102) {
                System.out.printf("닭은 %d마리, 개는 %d마리입니다.\n", chicken, dog);
            }
        } */

        /* int chicken = 0;
        while (chicken <= 37) {
            int dog = 37 - chicken;
            if (2 * chicken + 4 * dog == 102) {
                System.out.printf("닭은 %d마리, 개는 %d마리입니다.\n", chicken, dog);
            }
            chicken++;
        } */

            int chicken = 0;

            do {
                int dog = 37 - chicken;
                if (2 * chicken + 4 * dog == 102) {
                    System.out.printf("닭은 %d마리, 개는 %d마리입니다.\n", chicken, dog);
                }
                chicken++;
            } while (chicken <= 37);
        }
    }