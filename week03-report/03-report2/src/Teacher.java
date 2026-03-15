public class Teacher extends Person {

    public Teacher() {
        super("영희", 24);
    }

    public void teach() {
        System.out.println(name + "선생님이 수업을 합니다.");
    }
    void grade() {
        System.out.println(name +" 선생님이 과제를 채점합니다.");
    }
}

