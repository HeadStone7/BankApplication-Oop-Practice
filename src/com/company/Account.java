package com.company;

/**
 * by Joseph NTADI
 * 4/7/2022
 * Java Bank application
 *
 */

public class Account {
    private String  bankName;
    private Long accountNo;
    private String accountOwner;
    private double balance;
    private String phone;

    /**
     * Account constructor
     *
     * @param accountNo
     * @param accountOwner
     * @param balance
     * @param phone
     */

    public Account( Long accountNo, String accountOwner, double balance, String phone) {
        this.bankName = "Bank of R.Congo";
        this.accountOwner = accountOwner;
        this.accountNo = accountNo;
        this.balance = balance;
        this.phone = phone;
    }

    /**
     * Deposit method
     *
     * @param amount
     */
    public void deposit(double amount){
        if(amount <= 0 ){
            System.out.println("Invalid operation");
        }
        balance+=amount;
        System.out.println("Operation success, current inquiry="+balance+"Fcfa");
    }

    /**
     * Withdraw method
     * @param amount
     * @return
     */

    public boolean withdraw(double amount){
        if(amount>balance){
            System.out.println("your inquiry is not enough to withdraw this amount");
            return false;
        }
        balance-=amount;
        System.out.println("Transaction complete, please take your cash, current balance= "+balance+"Fcfa");
        return true;
    }

    /**
     * Inquiry method
     */
    public void inquiry(){
        System.out.println("you have: "+balance+"Fcfa");
    }

    /**
     * Bank name
     * @return
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Bank ToString method
     * @return
     */
    @Override
    public String toString() {
        String obj ="=====================================================\n" +
                    "Bank name       = "+bankName+"\n" +
                    "Account id      = "+accountNo+"\n"+
                    "Bank owner name = "+accountOwner+"\n"+
                    "Current Balance = "+balance+"\n"+
                    "Phone number    = "+phone+"\n"+
                    "=====================================================\n";
        return obj;
    }
}
