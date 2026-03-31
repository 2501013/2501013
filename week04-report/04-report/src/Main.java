import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {
  Department[] depts = {
          new Department(1, "경리과", 250000), // 0
          new Department(2, "인사과", 250000), // 1
          new Department(3, "영업팀", 350000), // 2
          new Department(4, "생산과", 350000), // 3
          new Department(5, "A/S팀", 300000)  // 4
  };

  Position[] posts = {
          new Position(1, 300000), // 0 (급호 1-x)
          new Position(2, 200000), // 1 (급호 2-x)
          new Position(3, 100000)  // 2 (급호 3-x)
  };

  ArrayList<Employee> list = new ArrayList<>();


  list.add(new Employee("홍길동", "11111", depts[0], posts[0], new Grade(1, 1), false, 200000));
  list.add(new Employee("한국민", "12231", depts[2], posts[1], new Grade(2, 3), false, 300000));
  list.add(new Employee("이대한", "13156", depts[3], posts[1], new Grade(2, 4), true, 200000));
  list.add(new Employee("한아름", "13211", depts[4], posts[2], new Grade(3, 3), false, 100000));
  list.add(new Employee("새로움", "16171", depts[3], posts[2], new Grade(3, 5), false, 200000));

  list.add(new Employee("이기쁨", "17778", depts[2], posts[1], new Grade(2, 3), false, 200000));
  list.add(new Employee("정동진", "18567", depts[0], posts[1], new Grade(2, 2), true, 200000));
  list.add(new Employee("김진우", "19129", depts[3], posts[0], new Grade(1, 1), false, 200000));
  list.add(new Employee("이나래", "19891", depts[2], posts[2], new Grade(3, 4), false, 200000));
  list.add(new Employee("박명길", "21190", depts[1], posts[1], new Grade(2, 5), false, 300000));

  Employee[] employees = list.toArray(new Employee[0]);
  Company company = new Company(employees);
  company.display();
 }
}

