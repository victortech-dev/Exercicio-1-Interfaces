package model.services;

public class PaypalService implements OnlinePaymentService {


    public double interest(double amount, int months) {
        return amount * 0.01 * months;
    }

    public double rate(double amount) {
        double tax = amount * 0.02;
        return tax;
    }

}
