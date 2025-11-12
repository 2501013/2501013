import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동", "이재명", "윤석열", "경복대", "오세훈"};
        float[] weight = new float[name.length];
        final float MIN = 30.0f;
        final float MAX = 120.0f;
        boolean swapped = false;

        int i = 0;
        while (i < name.length) {
            System.out.printf("%s님의 몸무게 입력 : ", name[i]);
            weight[i] = keyboard.nextFloat();

            if (weight[i] >= MIN && weight[i] <= MAX)
                i++;
            else {
                System.err.printf("ERROR : %.1f ~ %.1f", MIN, MAX);
                System.in.read();
            }
        }

        /* Sort (Bubble Sort) */

        for (i = 0; i < name.length - 1; i++) {
            swapped = false;

            // 인접한 원소 비교 및 교환
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (weight[j] > weight[j + 1]) {
                    // 자리 교환 (swap)
                    float temp = weight[j];
                    weight[j] = weight[j + 1];
                    weight[j + 1] = temp;

                    String text = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = text;
                    swapped = true;
                }
            }
            // 교환이 한 번도 없으면 이미 정렬 완료 → 종료
            if (!swapped) break;
        }

        for (i = 0; i < name.length; i++) {
            System.out.printf("%s님의 몸무게 : %5.1f Kg\n", name[i], weight[i]);
        }


    }
}