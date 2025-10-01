//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int a = 5;
    boolean test =(5 > 4)&& a++ != 0;
    System.out.printf("test = %b, a = %d\n", test,a); //true,6

        test =(5 < 4)&& a++ != 0;
        System.out.printf("test = %b, a = %d\n", test,a); //false,6

        test =(5 < 4) || a++ != 0;
        System.out.printf("test = %b, a = %d\n", test,a); //true,7

        test =(5 > 4) || a++ != 0;
        System.out.printf("test = %b, a = %d\n", test,a); //true,7

        a = 5;
        test =(5 > 4) & a++ != 0;
        System.out.printf("test = %b, a = %d\n", test,a); // a = 6, true

        test =(5 < 4) & a++ != 0;
        System.out.printf("test = %b, a = %d\n", test,a); // a = 7, flase

        test =(5 < 4) | a++ != 0;
        System.out.printf("test = %b, a = %d\n", test,a); // a = 8, true

        test =(5 > 4) | a++ != 0;
        System.out.printf("test = %b, a = %d\n", test,a); //a= 9, true

    }
}