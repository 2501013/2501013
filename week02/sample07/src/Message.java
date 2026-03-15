public class Message {
    private  String name;
    private  int age;

    public  Message(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void show(String name, int age) {
        System.out.printf("안녕하세요! 저는 %s이고, 나이는 %d살입니다.\n", name, age);
    }

    @Override
    public String toString() {
        return  String.format("안녕하세요! 저는 %s이고, 나이는 %d살입니다.\n", name, age);

    }
}
