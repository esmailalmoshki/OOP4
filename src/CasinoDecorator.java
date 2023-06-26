import java.util.ArrayList;

public class CasinoDecorator extends Casino {
    public CasinoBankAgent casinoBankAgent = new CasinoBankAgent();
    public CasinoDecorator(Dealer dealer, ArrayList<Player> players) {
        super(dealer, players);
    }

    @Override
    public void play() {
    }


}
