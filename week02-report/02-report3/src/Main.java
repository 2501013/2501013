//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
  Date birthday = new Date(2006,06,12);
  Date today = new Date(2026,03,15);
  Date free = new Date(2025,02,28);



  System.out.println("\n당신의 생일은\n"+birthday);
  System.out.println("\n오늘의 날짜는\n"+today);
  System.out.println("\n2025년 2월 28을 지정해보자\n"+free);

      today.setYear(2023);

      System.out.println("\n년도 수정 후\n" + today);

    }
}