import java.util.Scanner;

public class Customer extends Person implements Comparable<Customer> {
    private String waterNo;
    protected int usage;
    protected final int BASIC = 1660;

    public Customer(String name, String waterNo) {
        super(name);
        this.waterNo = waterNo;
    }

    public void inputUsage() {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("%s 고객의 사용량 입력 : ", super.getName());
        this.usage = keyboard.nextInt();
    }


    public int fee() {
        double amount = 0;
        int tempUsage = usage;


        if (tempUsage > 500) { amount += (tempUsage - 500) * 643.9; tempUsage = 500; }
        if (tempUsage > 400) { amount += (tempUsage - 400) * 466.4; tempUsage = 400; }
        if (tempUsage > 300) { amount += (tempUsage - 300) * 353.6; tempUsage = 300; }
        if (tempUsage > 200) { amount += (tempUsage - 200) * 278.3; tempUsage = 200; }
        if (tempUsage > 100) { amount += (tempUsage - 100) * 223.8; tempUsage = 100; }
        amount += tempUsage * 184.1;

        return BASIC + (int)Math.round(amount);
    }

    public int tax() {
        return (int)(fee() * 0.07);
    }

    public int pay() {
        return fee() + tax();
    }

    public String getMessage() { return ""; }

    @Override
    public int compareTo(Customer o) {
        return this.pay() - o.pay(); // 납부금액 기준 오름차순
    }


    @Override
    public String toString() {
        return String.format("%-6s %s %6dKw %,10d원 %,8d원 %,10d원  %s",
                waterNo, super.toString(), usage, fee(), tax(), pay(), getMessage());
    }
}
