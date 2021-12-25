package text1;

public class TestAccount {
    public static void main(String[] args) {
        Account obj1 = new Account(1122, 20000, 0.045);
        System.out.println(obj1.getDataCreated());
        obj1.withDraw(2500);
        System.out.println(obj1.getBalance());
        obj1.deposit(3000);
        System.out.println(obj1.getBalance());
        System.out.println("该账户月利息为：" + obj1.getMonthlyInterestRate());
    }
}
