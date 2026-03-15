//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Box myBox = new Box(20, 20, 20, "황색", "경복대학교");
        Box yourBox = new Box(40, 40, 15, "빨강색", "소프트웨어융합과");

        System.out.println(myBox);
        System.out.println(yourBox);
    }
}