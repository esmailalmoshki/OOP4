public interface BankingSystem {
    public void deposit(Player player, double sum);
    public void withdraw(Player player ,double sum);
    public boolean hasEnoughBalance(Player player , double sum);
}
