package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            System.out.println("Among the contract data: ");
            System.out.println("Number:");
            int number = Integer.parseInt(sc.next());
            sc.nextLine();
            System.out.println("data:");
            LocalDate dueData = LocalDate.parse(sc.nextLine(), fmt);
            System.out.println("value contract: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the number instalttement: ");
            int installtment = Integer.parseInt(sc.next());
            sc.nextLine();
            Contract contract = new Contract(number, dueData, amount, installtment);
            ContractService contractService = new ContractService(new PaypalService());
            contractService.processContract(contract, installtment);

            for (Installment it : contract.getInstallments()) {
                System.out.println(it);
            }
        } catch (DateTimeParseException e) {
            LocalDate dueDate = null;
            while (dueDate == null) {
                System.out.println("Digite o formato exigido para a data dd/MM/yyyy");
                break;
            }
        }
        sc.close();
    }

}
