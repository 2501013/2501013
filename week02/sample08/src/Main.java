//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder(4, 5);
        System.out.println(adder);

        Adder[] adders = new Adder[] {
                new Adder(4, 5),
                new Adder(8, 9),
                new Adder(12, 56)};

        for (int i = 0; i < adders.length; i++) {
            System.out.println(adders[i]);
        }

    }
}