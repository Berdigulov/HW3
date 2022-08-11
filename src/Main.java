public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while(true){
            try {
                bankAccount.withDraw(6000);
            }catch (LimitException le){
                bankAccount.withDraw(6000);
                System.out.println("Now you have " + bankAccount.getAmount());
                break;
            }
        }
    }
}