import java.util.ArrayList;

public class UsualCasino extends CasinoDecorator {
    @Override
    public void play() {

    }

    public UsualCasino(Dealer dealer, ArrayList<Player> players) {
        super(dealer,players);
    }


}
