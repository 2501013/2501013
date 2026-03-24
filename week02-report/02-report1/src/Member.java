public class Member {

    private String name;
    private  String type;
    private  int year;
    private  int size;
    private String display;

    public Member(String name, String type, int year, int size, String display) {
        this.name = name;
        this.type = type;
        this.year = year;
        this.size = size;
        this.display = display;
    }

    @Override
    public String toString() {
        return String.format("오늘 새로 구입한 %s는 %s에서 %d년 형 %d 인치\n %s 입니다.\n",name, type, year,
                size,display);
    }
}
