import java.util.ArrayList;

public abstract class Casino {
    public ArrayList<Player> players;
    public Dealer dealer;


    public abstract void play();

    public Casino(Dealer dealer, ArrayList<Player> players) {
        this.dealer = dealer;
        this.players = players;
    }


}
