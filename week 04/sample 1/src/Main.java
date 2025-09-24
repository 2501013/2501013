//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = -a;

        int c =(((a++) + 5) + (--b));
        // b = b -1; -6
        //c = a + 5 + b; 4
        //a + a +1; 6

        int d =(((++a) + 6) - (++b));
        //a = a + 1; 7
        //b = b+ 1; -5
        //d = a +6 -b; -18

        float e = (float) a / c;
        int f = 9 % 4; //1
        int g = -9 % 4;
        float h = -9.2f % 4; //-1.2f


        a += 5 * c; // a = a+(5*c); // 27fr


        System.out.printf("a = %d, b = %d, c = %d, d = %d, e = %.2f, f = %,d, g = %d, h = %.2f\n",a,b,c,d,e,f,g,h);














    }
}