package Week12.Bank;

public class AccountHolder {
    int id;
    String name;
    String address;
    String phone;

    public AccountHolder(String name, String address, String phone){
        System.out.println("Constructor 1");
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


}
