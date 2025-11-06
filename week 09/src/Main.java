//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int TURTLE = (35 * 1000) / (60 * 60);
        final int RABBIT = (60 * 1000) / (60 * 60);
        int turtle = 450;
        int rabbit = 0;

        int i = 1;
        for (   ; true; i++) {
            turtle += TURTLE;
            rabbit += RABBIT;

            if (rabbit > turtle)
                break;
            System.out.printf("%d초후 거북이 : %,d m이고, 토끼 : %,d m\n", i, turtle, rabbit);
        }
        System.out.printf("%d초후 거북이 : %,d m이고, 토끼 : %,d m\n", i, turtle, rabbit);
    }
}