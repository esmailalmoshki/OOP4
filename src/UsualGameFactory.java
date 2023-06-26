import java.util.ArrayList;

public class UsualGameFactory implements GameFactory{
    @Override
    public Dealer createDealer(String name) {
        return new UsualDealer(name);
    }

    @Override
    public Player createPlayer(String name) {
        return new UsualPlayer(name);
    }

    @Override
    public Casino createPlayingGround(Dealer dealer, ArrayList<Player> players) {
        return new UsualCasino(dealer, players);
    }
}
