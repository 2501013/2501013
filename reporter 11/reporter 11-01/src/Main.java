import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");

        int count = 10;
        String[][] user = new String[count][2];
        int[] code = new int[count];
        double[] usage = new double[count];
        int[][] fee = new int[count][4];

        String[] typeName = {"","가정용","영업용","공장용","관공서","군기관"};
        int[] unit = {0,40,55,78,35,20};
        int BASIC = 1200;

        System.out.println("번호 이름 구분 사용양\n");

        for (int i = 0; i < count; ) {
            System.out.printf("[%d/%d] 입력 → ", i + 1, count);

            user[i][0] = keyboard.next();
            user[i][1] = keyboard.next();
            String codeInput = keyboard.next();
            usage[i] = keyboard.nextDouble();

            if (user[i][0].length() != 4) {
                System.err.println("번호는 문자/숫자 4자리");
                continue;
            }

            boolean isNumber = true;
            for (int k = 0; k < codeInput.length(); k++) {
                char c = codeInput.charAt(k);
                if (c < '0' || c > '9') {
                    isNumber = false;
                    break;
                }
            }
            if (!isNumber) {
                System.err.println("구분은 1~5로 입력해주세요. (가정용(1), 영업용(2), 공장용(3), 관공서(4), 군기관(5))");
                continue;
            }

            code[i] = Integer.parseInt(codeInput);
            if (code[i] < 1 || code[i] > 5) {
                System.err.println("구분은 1~5로 입력해주세요. (가정용(1), 영업용(2), 공장용(3), 관공서(4), 군기관(5))");
                continue;
            }

            i++;
        }

        for (int i = 0; i < count; i++)
            fee[i][0] = (int)Math.floor(usage[i] + 0.5);

        for (int i = 0; i < count; i++)
            fee[i][1] = fee[i][0] * unit[code[i]];

        for (int i = 0; i < count; i++) {

            double taxRaw;

            if (code[i] == 5) {
                taxRaw = 0;
            } else {
                taxRaw = (BASIC + fee[i][1]) * 0.05;
            }

            int tax = (int)taxRaw;
            tax /= 10;
            tax *= 10;

            fee[i][2] = tax;
        }

        for (int i = 0; i < count; i++)
            fee[i][3] = BASIC + fee[i][1] + fee[i][2];

        System.out.println("\n               수   도   요   금");
        System.out.println("------------------------------------------------");
        System.out.println("번호   이름    구분     사용양    사용금액     TAX     납부액     비고");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < count; i++) {
            String note = (fee[i][2] == 0) ? "일괄징수" : "";
            System.out.printf(
                    "%s  %-6s %-6s %7.1f %10s %8s %10s   %s\n",
                    user[i][0],
                    user[i][1],
                    typeName[code[i]],
                    usage[i],
                    df.format(fee[i][1]),
                    df.format(fee[i][2]),
                    df.format(fee[i][3]),
                    note
            );
        }

        System.out.println("------------------------------------------------");
    }
}
