import java.util.ArrayList;

public class BlackJackCasino extends CasinoDecorator {
    //TODO declare handleBlackJack function that should be instantiated on the BlackJackDealer class
    @Override
    public void play() {
        BlackJackFactory blackJackFactory = new BlackJackFactory();
        Dealer dealer = this.dealer;

        dealer.shuffle();
        dealer.deal(players);
        ((BlackJackDealer)dealer).compare(players);
    }

    public BlackJackCasino(Dealer dealer, ArrayList<Player> players) {
        super(dealer,players);
    }

    public void addPlayer(Player player){

        this.players.add(player);
    }


   public void depositWinnings() {
       players.forEach(e -> {
           if (e.getStatus().equals("Win")) {
               this.casinoBankAgent.deposit(e, e.getBet() * 0.5);
           }
       });
    }

   public void withdrawLostBet(){
       players.forEach(e -> {
           if (e.getStatus().equals("Loss")){
               this.casinoBankAgent.withdraw(e,e.getBet());
           }
       });

   }



}
