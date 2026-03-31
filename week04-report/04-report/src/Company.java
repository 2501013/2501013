public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    private void sortById() {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {


                if (employees[i].getEmployeeID()
                        .compareTo(employees[j].getEmployeeID()) > 0) {

                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }

    private void line() {
        for (int i = 0; i < 120; i++) System.out.print("-");
        System.out.println();
    }

    protected void display() {
        sortById();
        line();
        System.out.println("이름    사번    부서명   원호  급-호    본봉       업무수당     직급수당     공제금액      세금      수령액");
        line();
        int count = 0;
        for (Employee e : employees) {
            System.out.println(e);
            count++;


            if (count == 5) {
                System.out.println();
            }
        }
        line();
    }
}