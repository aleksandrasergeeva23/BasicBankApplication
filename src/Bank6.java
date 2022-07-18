import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Bank6 {
    public static void main(String[] args) {
        System.out.println("Bank Admin menu:");
        System.out.println("Please Enter a menu option:");
        System.out.println("(1): Add a customer to Bank");
        System.out.println("(2): Change Customer name");
        System.out.println("(3): Check account balance");
        System.out.println("(4): Modify account balance");
        System.out.println("(5): Summary of all accounts");
        System.out.println("(-1): Quit");

        Scanner input = new Scanner(System.in);
        int userResponse = input.nextInt();
        int ID = 0;
        double[] balancesList = new double[250];
        String[] namesList = new String[250];
        if(userResponse == 1){
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
        } else if (userResponse == 2){
            System.out.println("Bank 'Change Name' menu");
            System.out.println("Please enter customer's ID to change their name");
            int index = input.nextInt();
            System.out.println("What is the customer's new name?");
            input.nextLine();
            namesList[index] = input.nextLine();
        } else if (userResponse == 3){
            System.out.println("Bank 'Check account balance' menu");
            System.out.println("Please enter a customer ID to check their balance");
            int index = input.nextInt();
            System.out.println("Customer " + namesList[index] + " has " + balancesList[index] + " eur in their account");
        } else if (userResponse ==4){
            System.out.println("Bank 'Modify Balance' Menu");
            System.out.println("Please enter a customer ID to check their balence");
            int index = input.nextInt();
            System.out.println("What is the customer's new balence");
            balancesList[index] = input.nextDouble();
            System.out.println("The balance is updated. The balance of the customer " + namesList[index] + " now is " + balancesList[index]);
        } else if (userResponse ==5){

        } else if (userResponse == -1){

        } else {

        }
    }
}
