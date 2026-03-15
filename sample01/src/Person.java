public class Person {
    private String name;    // 이름
    private int age;       // 나이
    private String gender;  // 성별 (남자, 여자)
    private boolean married;  // true = 결혼, false = 미혼
    private int child;

    public Person(String name, int age, String gender, boolean married, int child) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
        this.child = child;
    }

    //Method
    @Override
    public String toString() {
        return String.format("나이는 %d살, 이름은 %s이라는 %s가 있습니다.\n" +
                        " 이 %s는 결혼을 %s 자식이 %d명이 있습니다.\n", age, name, gender, gender,
                married ? "했고" : "안 했고", child);
    }
}
