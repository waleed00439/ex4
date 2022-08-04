public class ex3 {
    private String id;
    private String name;
    private int balance = 0;

    public void Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public <Account> int transferto(Account another, int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            String credit = "credit";
            another.amount(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +//                '}';
    }

    public static void main(String[] args) {


    }

}
