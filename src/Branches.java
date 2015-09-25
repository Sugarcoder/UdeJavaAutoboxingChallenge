import java.util.ArrayList;

public class Branches {

    private String name;
    private ArrayList<Customers> bankCustomers;


    public Branches(String name){
        this.name = name;
        this.bankCustomers = new ArrayList<Customers>();
    }




    public String getName(){
        return name;
    }



    public ArrayList<Customers> getBankCustomers() {
        return bankCustomers;
    }


    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null) {
            this.bankCustomers.add(new Customers(customerName, initialAmount));
            return true;
        }

        return false;

    }


    public boolean addCustomerTransaction(String customerName, double amount) {
        Customers existingCustomer = findCustomer(customerName);

        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        System.out.println("Customer is not on file");
        return false;

    }


    private Customers findCustomer(String customerName){
        for(int i=0; i<this.bankCustomers.size(); i++) {

            Customers checkedCustomer = this.bankCustomers.get(i);

            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

}
