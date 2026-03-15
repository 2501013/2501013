import java.time.LocalDate;

public class Person {
    private String name;
    private Date birthDay;
    private int height;
    private float weight;

    public Person(String name, Date birthDay, int height, float weight) {
        this.name = name;
        this.birthDay = birthDay;
        this.height = height;
        this.weight = weight;
    }



    public int getAge() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthDay.getYear();
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s는 키가 %dCm이고, 몸무게는 %.1fKg이고, 나이는 %d살 입니다.",
                name, height, weight, getAge());
    }
}
