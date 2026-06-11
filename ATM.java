import java.util.Scanner;

public class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount account) {
        this.userAccount = account;
    }

    public void startDashboard() {
        Scanner scanner = new Scanner(System.in);
        boolean active = true;

        while (active) {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.printf("\nBalance: $%.2f\n", userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("\nEnter deposit amount: $");
                    double depAmount = scanner.nextDouble();
                    userAccount.deposit(depAmount);
                    break;
                case 3:
                    System.out.print("\nEnter withdrawal amount: $");
                    double withAmount = scanner.nextDouble();
                    userAccount.withdraw(withAmount);
                    break;
                case 4:
                    System.out.println("\nExiting system.");
                    active = false;
                    break;
                default:
                    System.out.println("\nInvalid selection.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000.00);
        ATM atmMachine = new ATM(myAccount);
        atmMachine.startDashboard();
    }
}