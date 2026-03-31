public class Grade {
    private int grade; // 직급
    private int step;  // 호봉
    private int baseSalary;

    public Grade(int grade, int step) {
        this.grade = grade;
        this.step = step;
        setBaseSalary();
    }

    private void setBaseSalary() {
        int[][] table = {
                {0,0,0},
                {1250000,950000,750000},
                {1200000,925000,725000},
                {1150000,900000,700000},
                {1100000,875000,675000},
                {1050000,850000,650000}
        };

        baseSalary = table[step][grade - 1];
    }

    public int getGrade() { return grade; }
    public int getStep() { return step; }
    public int getBaseSalary() { return baseSalary; }
}