import java.util.ArrayList;
import java.util.Scanner;

public class PokerCasino extends CasinoDecorator{
    public PokerCasino(PokerDealer dealer, ArrayList<Player> players) {
        super(dealer, players);
    }

    @Override
    public void play() {

    }
    public void startGame(){

    }
    public void deal(){
        this.dealer.deal(players);
    }
    public void receiveBets(){
        for (Player player :players){
            Scanner sc = new Scanner(System.in);
            System.out.println("Player "+ player.getName()+ " : wants to bet  ");
            double bet = sc.nextDouble();
            if (this.casinoBankAgent.hasEnoughBalance(player,bet)){
                player.setBet(player.getBet()+bet);
            }
            else {
                System.out.println("Player : "+player.getName()+" does not have enough balance");

            }
        }
    }
    public void compare(){
        ((PokerDealer) dealer).compare(players);
    }

}
