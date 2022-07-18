import java.util.Scanner;

public class Bank5 {
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
        if( userResponse == 1){
            System.out.println("Bank 'Add Customer' menu");
            System.out.println("Please enter an account Balance");
            double balance = input.nextDouble();
            balancesList[ID] = balance;
            System.out.println("Please enter an account holder name: ");
            input.nextLine();
            String name = input.nextLine();
            namesList[ID] = name;
            System.out.println("Customer's ID is :" + ID);
            ID ++;
        } else if (userResponse == 2){

        } else if (userResponse == 3){

        } else if (userResponse ==4){

        } else if (userResponse ==5){

        } else if (userResponse == -1){

        } else {

        }
    }
}
