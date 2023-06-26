public class CasinoPokerBankAgent implements BankingSystem{
    @Override
    public void deposit(Player player, double sum) {
        Bank.bank.deposit(player,sum);

    }

    @Override
    public void withdraw(Player player, double sum) {
        Bank.bank.withdraw(player, sum);

    }

    @Override
    public boolean hasEnoughBalance(Player player, double sum) {
        return Bank.bank.hasEnoughBalance(player,sum);
    }
}
