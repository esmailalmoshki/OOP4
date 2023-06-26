import java.util.ArrayList;

public class BlackJackFactory implements GameFactory{
    @Override
    public Dealer createDealer(String name) {
        return new BlackJackDealer(name);
    }

    @Override
    public Player createPlayer(String name) {
        return new BlackJackPlayer(name);
    }

    @Override
    public Casino createPlayingGround(Dealer dealer, ArrayList<Player> players) {
        return new BlackJackCasino(dealer,players);
    }
}
