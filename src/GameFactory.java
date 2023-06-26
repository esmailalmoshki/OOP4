import java.util.ArrayList;

public interface GameFactory {
    public Dealer createDealer(String name);

    public Player createPlayer(String name);
    public Casino createPlayingGround(Dealer dealer , ArrayList<Player> players);

}
