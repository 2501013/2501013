public class Doctor extends Person {

    public Doctor() {
        super("철수",45);
    }

    public void treat() {
        System.out.println(name + "의사가 환자를 진료합니다.");
    }
    public void surgery() {
        System.out.println(name + "의사가 수술도 진행합니다.");
    }
}