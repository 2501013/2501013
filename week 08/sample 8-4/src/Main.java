import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double purchasePrice = 1015000;
        double profitRate = 0.3;
        double taxRate = 0.1;
        double sellingPrice,salesTax,purchaseTax,payableTax;

        sellingPrice = purchasePrice * (1 + profitRate);
        salesTax = sellingPrice * taxRate;
        purchaseTax = purchasePrice * taxRate;
        payableTax = salesTax - purchaseTax;



        System.out.printf("관할 세무서에 낼 세금 액은 %,.0f원 입니다.\n", payableTax);
            }
        }
