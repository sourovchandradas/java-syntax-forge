// Exercise 02: Tax Bracket Calculator

public class TaxCalculator {
    public static void main(String[] args){
        double income = 20942019;
        int tax_rate;
        if(income > 100000){
            tax_rate = 30;
        }else if(income > 50000){
            tax_rate = 20;
        }else if(income > 20000){
            tax_rate = 10;
        }else{
            tax_rate = 0; 
        }

        // Calculate tax amount
        double tax_amount = income * tax_rate / 100.0;

        System.out.println("Income: " + income);
        System.out.println("Tax Rate: " + tax_rate + "%");
        System.out.println("Tax Amount:" + tax_amount);
    }
}
