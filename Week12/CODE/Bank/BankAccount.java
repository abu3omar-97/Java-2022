package Week12.Bank;

public class BankAccount {
    int id;
    String password;
    double balance;
    AccountHolder accountHolder;

    boolean withdraw(int amount){
        if(amount > this.balance){
            System.out.println("NOT ENOUGH");
            return false;
        }
        if(amount < 0){
            System.out.println("NEGATIVE");
            return false;
        }

        this.balance -= amount;
        return true;

    }

    boolean deposit(int amount){
        if(amount < 0 ) return false;

        this.balance += amount;
        return true;
    }

    boolean transfer(BankAccount to, int amount){
        if(amount > this.balance){
            System.out.println("NOT ENOUGH");
            return false;
        }
        if(amount < 0){
            System.out.println("NEGATIVE");
            return false;
        }

        this.balance -= amount;
        to.balance += amount;

        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + this.id +
                ", balance=" + this.balance +
                ", accountHolder=" + this.accountHolder.name +
                ", accountHolder=" + this.accountHolder.address +
                ", accountHolder=" + this.accountHolder.phone +
                '}';
    }
}
