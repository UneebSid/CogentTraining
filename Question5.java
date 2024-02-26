package Day9;


abstract class Bank
{
    abstract double getBalance();
}

class BankA extends Bank
{
    double balance = 0;


    public void withdraw(double amount)
    {
        if(amount > balance)
        {
            System.out.println("Operation failed..Insufficient balance.");
        } else
        {
            balance -= amount;
            System.out.println("success.");
        }
    }

    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Successfully deposited +$" + amount );
    }


    @Override
    double getBalance() {
        return this.balance;
    }
}

class BankB extends Bank
{

    double balance =0;

    public void withdraw(double amount)
    {
        if(amount > balance)
        {
            System.out.println("Operation failed..Insufficient balance.");
        } else
        {
            balance -= amount;
            System.out.println("success.");
        }
    }

    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Successfully deposited +$" + amount );
    }


    @Override
    double getBalance() {
        return this.balance;
    }
}


class BankC extends Bank
{

    double balance =0;

    public void withdraw(double amount)
    {
        if(amount > balance)
        {
            System.out.println("Operation failed..Insufficient balance.");
        } else
        {
            balance -= amount;
            System.out.println("success.");
        }
    }

    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Successfully deposited +$" + amount );
    }


    @Override
    double getBalance() {
        return this.balance;
    }
}

public class Question5 {

    public static void main(String[] args) {

        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.deposit(100);
        bankB.deposit(150);
        bankC.deposit(200);

        System.out.println(bankA.getBalance());
        System.out.println(bankB.getBalance());
        System.out.println(bankC.getBalance());

    }
}
