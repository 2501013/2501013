import java.io.IOException;

void main() throws IOException {

    Customer[] customers = new Customer[]{
            new Customer("정상진", "12345"),
            new Support("일본인", "92345"),
            new Customer("홍길동", "12345"),
            new Customer("한국인", "12345"),
            new Customer("고길동", "12345"),
            new Customer("이대한", "12345"),
            new Support("이기동", "92345"),
            new Support("박종호", "92345"),
            new Customer("이니나", "12345"),
            new Customer("윤상열", "12345")
    };

    WaterOffice office = new WaterOffice(customers);
    office.inputData();
    office.display();
}