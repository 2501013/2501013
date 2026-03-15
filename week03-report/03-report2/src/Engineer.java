public class Engineer extends Person {

    public Engineer() {
        super("민수",35);
    }

    public void develop() {
        System.out.println(name + " 엔지니어가 프로그램을 개발합니다.");
    }
    public void fixBug() {
        System.out.println(name + " 엔지니어가 프로젝트의 버그를 수정합니다.");
    }
}
