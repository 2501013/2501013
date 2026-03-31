public class Department {
    private int departNo;
    private String name;
    private int dutyPay;

    public Department(int departNo, String name, int dutyPay) {
        this.departNo = departNo;
        this.name = name;
        this.dutyPay = dutyPay;
    }

    public String getName() { return name; }
    public int getDutyPay() { return dutyPay; }
}