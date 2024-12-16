import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter Total Loan Amount: ");
        double loanAmount = sc.nextDouble();
        System.out.print("Enter Interest Rate: ");
        double interestRate = sc.nextDouble();
        Loan loan = new Loan(name, accountNumber, loanAmount, interestRate);
        loan.displayLoanDetails();
    }
}
class Loan {
    String customerName;
    String accountNumber;
    double totalLoan;
    double interestRate;
    double totalAmount;

    public Loan(String customerName, String accountNumber, double totalLoan, double interestRate) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.totalLoan = totalLoan;
        this.interestRate = interestRate;
        this.totalAmount = calculateTotalAmount();
    }

    public double calculateTotalAmount() {
        return totalLoan + (totalLoan * interestRate / 100);
    }

    public void displayLoanDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Total Loan: " + totalLoan);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Total Amount to be Repaid: " + totalAmount);
    }
}

