package entities;


public class Account {
    private String name;
    private double balance = 0.0;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }
}
