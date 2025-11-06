import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        for (int j = 1; j <= 3; j++) {
            System.out.printf("%d Set\n", j);

         /* for (int i = 1; i <= 20; i++) {
              System.out.printf("\t 팔굽혀펴기 : %d 회\n", i);
          } */

       /*   int i = 1;
          while (i <= 20) {
              System.out.printf("\t 팔굽혀펴기 : %d 회\n", i++);
          } */

            int i = 1;
            do {
                System.out.printf("\t 팔굽혀펴기 : %d 회\n", i++);
            } while (i <= 20);

        }
    }
}



