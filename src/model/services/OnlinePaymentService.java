package model.services;

public interface OnlinePaymentService {
    double interest(double amount, int months);

    double rate(double amount);
}
