import entities.Account;

public class Main {
    public static void main(String[] args) {
        var account = new Account();
        account.setName("personal");
        System.out.println(account.getName());
        System.out.println(account.getBalance());

    }
}
