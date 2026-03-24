import java.time.LocalDate;

public class Student {
    private String name;
    private  int rollno;
    private  String depart;
    private  int birthday;

    public Student(String name, int rollno, String depart, int birthday) {
        this.name = name;
        this.rollno = rollno;
        this.depart = depart;
        this.birthday = birthday;
    }

    public int getAge() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthday + 1;
    }

    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("학번: " + rollno);
        System.out.println("학과: " + depart);
        System.out.println("생년월일:" + birthday);
        System.out.println("나이: " + getAge());
    }


}
