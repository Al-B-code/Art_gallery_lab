public class Customer {
    
    private String name;
    private double wallet;
    
    
    public Customer(String name){
        this.name = name;
        this.wallet = 100; 
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
