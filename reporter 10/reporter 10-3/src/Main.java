import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard =  new Scanner(System.in);
        String[] hakbun = {"1601007", "1601003", "1601013", "1601024", "21601096",
                "1601058", "1601110", "1601077", "1601085", "1601026"};
        String[] name = {"이대한", "홍길동", "한나라", "이순신", "김혜숙",
                "김현호", "나희영", "이동국", "박예림", "김동근"};

        int arrayLength = name.length;


        int[] mid = new int[arrayLength];
        int[] fina = new int[arrayLength];
        int[] quiz = new int[arrayLength];
        int[] report = new int[arrayLength];
        int[] atten = new int[arrayLength];

        double[] finalScore = new double[arrayLength];
        int[] rank = new int[arrayLength];


        int i = 0;
        while (i < arrayLength) {
            System.out.printf("%s님의 중간 점수 (15%% 반영) 입력 : ", name[i]);
            mid[i] = keyboard.nextInt();
            System.out.printf("%s님의 기말 점수 (15%% 반영) 입력 : ", name[i]);
            fina[i] = keyboard.nextInt();
            System.out.printf("%s님의 퀴즈 점수 (10%% 반영) 입력 : ", name[i]);
            quiz[i] = keyboard.nextInt();
            System.out.printf("%s님의 과제 점수 (40%% 반영) 입력 : ", name[i]);
            report[i] = keyboard.nextInt();
            System.out.printf("%s님의 출석 점수 (20%% 반영) 입력 : ", name[i]);
            atten[i] = keyboard.nextInt();


            if ((mid[i] >= 0 && mid[i] <= 100) &&
                    (fina[i] >= 0 && fina[i] <= 100) &&
                    (quiz[i] >= 0 && quiz[i] <= 100) &&
                    (report[i] >= 0 && report[i] <= 100) &&
                    (atten[i] >= 0 && atten[i] <= 100)) {
                i++;
            } else {
                System.err.println("ERROR : 모든 점수는 0 ~ 100점 사이로 입력해야 합니다. 다시 입력해 주세요.");

            }
            System.out.println();
        }


        for (i = 0; i < arrayLength; i++) {
            finalScore[i] = (mid[i] * 0.15) +
                    (fina[i] * 0.15) +
                    (quiz[i] * 0.10) +
                    (report[i] * 0.40) +
                    (atten[i] * 0.20);
        }




        System.out.println("*****************************************************************");
        System.out.println(" 학번      이름  중간  기말  퀴즈  레포트  출석  점수");
        System.out.println("*****************************************************************");

        for (i = 0; i < arrayLength; i++) {
            System.out.printf("%-8s %-6s %4d %4d %4d %6d %5d %7.2f\n",
                    hakbun[i], name[i], mid[i], fina[i], quiz[i], report[i], atten[i], finalScore[i]);


            if (name[i].equals("김혜숙")) {
                System.out.println();
            }
        }

        System.out.println("*****************************************************************");
    }
}

