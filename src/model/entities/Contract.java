package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private Integer numberParcelas;
    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double totalValue, Integer numberParcelas) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.numberParcelas = numberParcelas;
        this.installments = new ArrayList<>();
    }

    public Integer getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public Integer getNumberParcelas() {
        return numberParcelas;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallment(Installment installment) {
        installments.add(installment);
    }

}
