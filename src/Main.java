public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(15000);
        while (true){
            try {
                account.withDraw(6000);
                System.out.println("Снято 6000 сом. Остаток на счете: " + account.getAmount());
            }catch (LimitException ex){
                ex.printStackTrace();
            }
            System.out.println("Остаток на счете: " + account.getAmount());
            break;
        }
    }
}