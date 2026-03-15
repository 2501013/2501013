//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        FastFood pizza = new FastFood("나의 피자", 20.0f);
        FastFood donut = new FastFood("경복 도넛", 5.5f);

        System.out.println(pizza);
        System.out.println(donut);
    }
}