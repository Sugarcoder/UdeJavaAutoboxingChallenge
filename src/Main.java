/**
 * Created by Sugarcoder on 9/21/2015.
 */

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Chase");

        bank.addBranch("Taraval");

        bank.addCustomer("Taraval", "Amy", 500.00);
        bank.addCustomer("Taraval", "Joe", 100.00);
        bank.addCustomer("Taraval", "Lydia", 20.00);

        bank.addBranch("Wells Fargo");
        bank.addCustomer("Wells Fargo", "Bob", 30.00);
        bank.addCustomer("Wells Fargo", "Joe", 60.00);

        bank.addCustomerTransaction("Taraval", "Amy", 20.00);
        bank.addCustomerTransaction("Taraval", "Amy", 30.00);
        bank.addCustomerTransaction("Taraval", "Lydia", 10.00);

        bank.listCustomers("Taraval", true);
        bank.listCustomers("Wells Fargo", true);


        if(bank.addBranch("Lakeshore")){
            System.out.println("Lakeshore branch created");
        }


        if(!bank.addCustomer("Lakeshore", "Sarah", 15.00)) {
            System.out.println("Error: This branch does not exist");
        }

        if(!bank.addBranch("Taraval")) {
            System.out.println("This branch already exists.");
        }

        if(!bank.addCustomerTransaction("Taraval", "Cathy", 45.00)) {
            System.out.println("Error: Customer does not exist at this branch.");
        }

        if(!bank.addCustomer("Wells Fargo", "Barbara", 21.00)) {
            System.out.println("This customer already exists.");
        }


    }
}
