import java.util.Scanner;

public class BankMaster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userResponse;
        int ID = 0;
        int sentinal = 0;
        double[] balancesList = new double[250];
        String[] namesList = new String[250];
        while(sentinal != -1) {
            System.out.println("Bank Admin menu:");
            System.out.println("Please Enter a menu option:");
            System.out.println("(1): Add a customer to Bank");
            System.out.println("(2): Change Customer name");
            System.out.println("(3): Check account balance");
            System.out.println("(4): Modify account balance");
            System.out.println("(5): Summary of all accounts");
            System.out.println("(-1): Quit");
            userResponse = input.nextInt();
            if (userResponse == 1) {
                System.out.println("Bank 'Add Customer' menu");
                System.out.println("Please enter an account Balance");
                double balance = input.nextDouble();
                balancesList[ID] = balance;
                System.out.println("Please enter an account holder name: ");
                input.nextLine();
                String name = input.nextLine();
                namesList[ID] = name;
                System.out.println("Customer's ID is :" + ID);
                ID++;
            } else if (userResponse == 2) {
                System.out.println("Bank 'Change Name' menu");
                System.out.println("Please enter customer's ID to change their name");
                int index = input.nextInt();
                System.out.println("What is the customer's new name?");
                input.nextLine();
                namesList[index] = input.nextLine();
            } else if (userResponse == 3) {
                System.out.println("Bank 'Check account balance' menu");
                System.out.println("Please enter a customer ID to check their balance");
                int index = input.nextInt();
                System.out.println("Customer " + namesList[index] + " has " + balancesList[index] + " eur in their account");
            } else if (userResponse == 4) {
                System.out.println("Bank 'Modify Balance' Menu");
                System.out.println("Please enter a customer ID to check their balence");
                int index = input.nextInt();
                System.out.println("What is the customer's new balence");
                balancesList[index] = input.nextDouble();
                //System.out.println("The balance is updated. The balance of the customer " + namesList[index] + " now is " + balancesList[index]);
            } else if (userResponse == 5) {
                System.out.println("Bank 'All Customer Summary' Menu");
                double total = 0;
                for (int i = 0; i < ID; i++) {
                    total = total + balancesList[i];
                    System.out.println(namesList[i] + " has " + balancesList[i] + " eur in their account");
                }
                System.out.println("In total, there is $" + total + " in the bank");
            }
            else if (userResponse == -1){
                System.exit(-1);
            } else {
                System.out.println("Error: invalid input was entered");
            }
        }
    }
}
