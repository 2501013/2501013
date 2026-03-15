 public class Person {
     protected String name;
     protected int age;

     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public void introduce() {
         System.out.println("안녕하세요, 제 이름은 " + name + "이고 " + age + "살 입니다.");
     }

}
