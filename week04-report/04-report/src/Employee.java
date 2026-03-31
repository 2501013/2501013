public class Employee {
    private String name;
    private String employeeID;
    private Department dept;
    private Position pos;
    private Grade grade;
    private boolean special;
    private int aid;

    public Employee(String name, String id, Department dept,
                    Position pos, Grade grade,
                    boolean special, int aid) {
        this.name = name;
        this.employeeID = id;
        this.dept = dept;
        this.pos = pos;
        this.grade = grade;
        this.special = special;
        this.aid = aid;
    }

    private int gross() {
        return grade.getBaseSalary() + dept.getDutyPay() + pos.getPositionPay();
    }

    private int deduction() {

        int personal = Math.min(aid, 300000);
        return (int)(grade.getBaseSalary() * 0.03) + personal;
    }

    private int tax() {

        if (special) {
            return (int)(grade.getBaseSalary() * 0.0003);
        }


        double t = gross() - deduction();
        return (int)(t * 0.0007);
    }

    public int payment() {
        return gross() - tax() - deduction();
    }

    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return String.format(
                "%-4s  %5s  %-4s   %2s    %d-%d  %,10d  %,10d  %,10d  %,10d  %,7d  %,10d",
                name, employeeID, dept.getName(), (special ? "O" : "X"),
                pos.getRank(), grade.getStep(), grade.getBaseSalary(),
                dept.getDutyPay(), pos.getPositionPay(),
                deduction(), tax(), payment()
        );
    }
}