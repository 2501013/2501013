import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard =  new Scanner(System.in);
                int arraySize = 10;
                int[] score = new int[arraySize];

                int total = score[0];
                int max = score[0];
                int min = score[0];
                float average;

                System.out.println("10명의 학생 (0~100)를 입력하세요.");
                for (int i = 0; i < arraySize; i++) {
                    int input;
                    do {
                        System.out.printf("%d : ", i + 1);
                        input = keyboard.nextInt();
                        if (input >= 0 && input <= 100) {
                            score[i] = input;
                            break;
                        } else {
                            System.out.println("ERROR: 0과 100 사이의 숫자를 다시 입력해 주세요.");
                        }
                    } while (true);
                }






                for (int i = 1; i < arraySize; i++) {
                    int currentScore = score[i];


                    total= total+currentScore;


                    if (currentScore > max) {
                        max = currentScore;
                    }


                    if (currentScore < min) {
                        min = currentScore;
                    }
                }

                average = (float) total / arraySize;

                System.out.println("\n--- 출력 결과 ---");
                System.out.printf("합계 : %d\n", total);
                System.out.printf("평균 : %.2f\n", average);
                System.out.printf("최댓값 : %d\n", max);
                System.out.printf("최솟값 : %d\n", min);
                System.out.println("-----------------");
            }
        }