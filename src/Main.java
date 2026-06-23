import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
    // JAVA BANKING PROGRAM FOR BEGINNERS

        // DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;


        // DISPLAY MENU
        while(isRunning){
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");

            System.out.print("choose your option (1-4): ");
            choice = scanner.nextInt();


        // GET AND PROCESS USERS CHOICE
            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit() ;
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Please enter a valid number");
            }
        }

        // EXIT MESSAGE
        System.out.println("Thank you for Banking with us");

    }
        // showBalance()
    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }

    // Deposit()
    static double deposit(){
        double amount;

        System.out.print("Enter amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount can not be Negative");
            return 0;
        }
        else {
            return amount;
        }


    }

    // Withdraw()
    static double withdraw(double balance){
        double amount;

        System.out.print("Enter withdrawal amount: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("INSUFFICIENT FUND");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can not be negative");
            return 0;
        }else{
            return amount;
        }
    }
}