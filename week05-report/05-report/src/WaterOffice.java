import java.util.Arrays;

public class WaterOffice {
    private Customer[] customers;

    public WaterOffice(Customer[] customers) { this.customers = customers; }

    public void inputData() {
        for (Customer c : customers) c.inputUsage();
    }

    public void display() {

        Arrays.sort(customers);

        System.out.println("\n*******************************************************************************");
        System.out.println("번호    이름    사용량      사용요금      세금       납부금액     비고");
        System.out.println("*******************************************************************************");
        for (Customer c : customers) {
            System.out.println(c);
        }
        System.out.println("*******************************************************************************");
    }
}