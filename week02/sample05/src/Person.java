public class Person {
    private String name;
    private int age;
    private char gender;
    private Club club;

    public Person(String name, int age, char gender, Club club) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.club = club;
    }

    @Override
    public String toString() {
        return String.format("나이(age)가 %d살, 이름(name)이 ‘%s’이라는 %c자가 있다.\n"+
                "이 %c자는 %s", age, name, gender, gender, club.toString());
    }
}
