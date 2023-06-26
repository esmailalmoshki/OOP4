import java.util.HashMap;
import java.util.Map;

public class Bank implements BankingSystem{
    public Map<Player, Double> accountHolders = new HashMap<Player,Double>();
    private Bank(){
        //connect to the bank database
    }
    public static Bank bank = new Bank();
    public static Bank getBank(){
        return bank;
    }




    public void deposit(Player accountHolder ,double sum ){
        if (!this.accountHolders.containsKey(accountHolder)){
            this.accountHolders.put(accountHolder ,sum );
        }
        else {
            this.accountHolders.put(accountHolder,accountHolders.get(accountHolder)+sum);
        }


     }

    public void withdraw( Player accountHolder ,  double sum){
        this.accountHolders.put(accountHolder,accountHolders.get(accountHolder)-sum);
    }

    public boolean hasEnoughBalance(Player player , double balanceToCheck){
        if(this.accountHolders.containsKey(player)) {
            return this.accountHolders.get(player) >= balanceToCheck;
        }
        return false;
    }

    public void listAccountDetails(){
        System.out.println("Account Holder  :  balance ");
        for (Player player:this.accountHolders.keySet()){
            System.out.println(player.getName()+" : "+accountHolders.get(player));
        }
    }



}
