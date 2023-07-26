import java.util.Scanner;

class Account 
{
    protected String user_id;
    protected String user_pass;
    Scanner sc = new Scanner(System.in);

    void createAcc() 
    {
        System.out.println("Enter the username:");
        user_id = sc.nextLine();
        System.out.println("Enter the Password:");
        user_pass = sc.nextLine();
        System.out.println(" Congratulation!!  Your Account created sucessfully");
    }
}

class LoginAcc extends Account {
    private String id;
    private String p;

    void login() 
    {
        do {
            System.out.println("Enter the username:");
            id = sc.nextLine();
            if (user_id.equals(id)) 
            {
                do 
                {
                    System.out.println("Enter the Password:");
                    p = sc.nextLine();
                    if (p.equals(user_pass)) {
                        System.out.println("Login Successfully!");
                    } else {
                        System.out.println("Wrong Password ! Please Enter correct password");
                    }

                } while (p.equals(user_pass) == false);
            } else {
                System.out.println("Wrong Password ! Please Enter correct password");
            }
        } while (user_id.equals(id) == false);

    }
}

class Deposit {
    int amount;
    int balance = 100000;
    int prevtransaction = 0;
    String Transactionhistory = "";
    Scanner sc = new Scanner(System.in);

    void Display() {
        System.out.println("Enter the amount for deposit:");
        amount = sc.nextInt();
        if (amount != 0) {
            prevtransaction++;
            balance = balance + amount;
            prevtransaction = amount;
            String str = amount + "rs deposited\n";
            Transactionhistory = Transactionhistory.concat(str);
            System.out.println("Amount is Successfully Deposited! ");
        }
    }
}

class Withdraw extends Deposit {

    void cash() {
        System.out.println("Enter the amount to withdraw:");
        amount = sc.nextInt();
        if (balance > amount) {
            if (amount <= 20000) {
                prevtransaction++;
                balance = balance - amount;
                prevtransaction = prevtransaction - amount;
                System.out.println("Amount withdraw successfully !");
                String str = amount + "rs withdrawed\n";
                Transactionhistory = Transactionhistory.concat(str);
            } else {
                System.out.println("Sorry !.........limit is 20000");
            }
        } else {
            System.out.println("Insufficient amount to withdraw!");
        }
    }
}

class Transfer extends Withdraw {
    void forward() {
        int bank_acc;
        int ac;
        int r_accbalance = 0;
        System.out.println("Enter the amount to transfer: ");
        amount = sc.nextInt();
        if (balance < amount) {
            System.out.println(" Oops ! You have not sufficient balance to transfer the amount");
        } else {
            System.out.println("Enter the account number of receivers' account:");
            ac = sc.nextInt();

            this.balance = this.balance - amount;
            r_accbalance += amount;
            System.out.println("Your account balance becomes $ " + this.balance);
            System.out.println("Account Balance receiver becomes $ " + r_accbalance);
            String str = amount + " Rs transfered";
            Transactionhistory = Transactionhistory.concat(str);
        }

    }
}

class CheckBalance extends Transfer {
    void check() {
        System.out.println("\n available balance::" + balance + " Rs");
    }

}

class TransactionHistory extends CheckBalance {
    void history() {
        if (prevtransaction == 0) {
            System.out.println("\nEmpty");
        } else {

            System.out.println("\n" + Transactionhistory);
        }
    }
}

class AtmInterface {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~ WELCOME TO VSJAVA BANK ~~~~~~~~~~~~~~~");
        LoginAcc l = new LoginAcc();
        l.createAcc();
        System.out.println(" WELCOME BACK TO VSJAVA BANK ");
        System.out.println("====================================================");
        System.out.println("~~~~~~~~~~~~~ WELCOME TO LOGIN TAB ~~~~~~~~~~~~~");
        l.login();

        int ch;
        Scanner sc = new Scanner(System.in);
        TransactionHistory t = new TransactionHistory();
        while (true) {
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("1. Check the Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Previous Transactions");
            System.out.println("5. Transfer");
            System.out.println("6. Exit");
            System.out.println("--------------------------------------------");
            System.out.println("Enter your Choice:");
            System.out.println("--------------------------------------------");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    t.check();
                    break;

                case 2:

                    t.Display();
                    break;

                case 3:

                    t.cash();
                    break;

                case 4:

                    t.history();
                    break;

                case 5:

                    t.forward();
                    break;

                case 6:
                    System.out.println("Thank you for using our ATM service");
                    System.exit(ch);
                    break;

                default:
                    System.out.println("Please Enter valid choice!");
            }
        }
    }
}