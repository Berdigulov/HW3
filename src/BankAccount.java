public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
         this.amount = sum + this.amount;
    }
    public void withDraw(int sum) throws LimitException {
        if (sum > amount && amount == 0) {
            throw new LimitException("You don't have enough money on your balance in order to withdraw money " + sum );
        }else if (sum < amount) {
            this.amount = this.amount - sum;
            System.out.println("Successful, you've just withdrawn your money "+ sum +"\nNow you have "+ amount );
        }else {
            System.out.println("We've withdrawn your remaining amount " + amount);
            this.amount = 0;
            System.out.println("Now you have " + amount);
        }
    }
}
