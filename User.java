/**
 * Created by VINNI on 20.11.16.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;


    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    void paySalary()
    {
        balance=balance+salary;
        System.out.println (balance+" "+currency);
    }

    void withdraw(int summ)
    {
        if (balance<1000)
        {
            int paypercent=summ*5/100;
            int payall=summ+paypercent;
            int balans = balance-payall;
            System.out.println (balans+" "+currency);
        }
        else
        {
            int paypercent=summ*10/100;
            int payall=summ+paypercent;
            int balans = balance-payall;
            System.out.println (balans+" "+currency);
        }
    }
    void companyNameLenght ()
    {
        int lenght=companyName.length();
        System.out.println (lenght);
    }

    void monthIncreaser(int addMonth)
    {
        monthsOfEmployment=monthsOfEmployment+addMonth;
        System.out.println (monthsOfEmployment);
    }


    public static void main(String[] args)
    {
        User obj = new User ("Name1", 2000, 2, "IBM", 100, "usd");
        obj.paySalary();
        obj.withdraw(50);
        obj.companyNameLenght();
        obj.monthIncreaser(2);
    }

}
