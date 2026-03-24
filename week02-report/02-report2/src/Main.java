//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
      Movie onemovie = new Movie(1,"헤라클레스","레니 할린",2014,"켈란 루츠", 6.9);
      Movie twomovie = new Movie(2,"노아","대런 아로노프스키",2004,"러셀 크로우",7.3);

        twomovie.setRankPoint(8.2);

      System.out.println(onemovie);
        System.out.println(twomovie);

        System.out.println("\n ==== movie1 ===\n" + "감독: " + onemovie.getDirector());
    }
}