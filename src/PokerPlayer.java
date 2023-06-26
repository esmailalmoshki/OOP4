public class PokerPlayer extends Player{

    public PokerPlayer(String name) {
        super(name);
    }

    @Override
    public void joinGame(Casino casino) {
        casino.players.add(this);
    }

    @Override
    public void allocateBet(float betSum) {
        this.setBet(betSum);
    }

    @Override
    public void takeCard(PlayingCard card) {

    }
}
