package Basics;


//Java Program to demonstrate the working of a banking-system where we deposit and withdraw amount from our account.
//Creating an Account class which has deposit() and withdraw() methods


class Account {
        int acc_no;
        String name;
        float amount;
        //    method to initialize the object
        void insert(int ac, String n, float amt){
            acc_no = ac;
            name = n;
            amount = amt;
        }
        //method to display the values of an object
        void display(){
            System.out.println(acc_no + " " + name + " " + amount + " " );
        }
        //   method to deposit the amount
        void deposit(float amt){
            amount = amount + amt;
            System.out.println(amt + " deposited");
        }
        //method to withdraw amount
        void withdraw(float amt){
            if(amount < amt){
                System.out.println("Insufficiant amount");
            }
            else{
                amount = amount - amt;
                System.out.println(amt + " amount withdraw");
            }
        }
    }

    //creating a BankSystem class to deposit and withdraw amount
    public class BankSystem{
        public static void main(String[] args){
            Account ac1 = new Account(),ac2 = new Account();
            ac1.insert(1367, "ashu", 1000 );
            ac1.display();
            ac1.deposit(1000);
            ac1.withdraw(500);
            ac1.display();
            ac2.insert(4650, "ashutosh", 2000);
            ac2.display();
            ac2.deposit(15000);
            ac2.withdraw(5000);
            ac2.display();
        }
    }



