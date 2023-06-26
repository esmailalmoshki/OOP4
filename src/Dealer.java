import java.util.ArrayList;

public abstract class Dealer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public abstract void deal(ArrayList<Player> players);

    public void dealRounds(ArrayList<Player> players, int roundNumber){
        for (int i = 0; i < roundNumber; i++) {
            for (Player player : players) {
                //Dealer gives one cards for each player on each round
                ArrayList<PlayingCard> holder = new ArrayList<>(player.cards);
                holder.add(deck.get(deck.size() - 1));
                player.setPlayingCards(holder);
                //Dealer removes the distributed card from the deck
                deck.remove(deck.size() - 1);
            }
        }
    }

    public ArrayList<PlayingCard> getPlayingCards() {
        return playingCards;
    }

    private ArrayList<PlayingCard> playingCards = new ArrayList<>();
    public Deck deck ;
    Dealer(String name){
        this.name = name;
        this.deck = Deck.getDeck();


    }

    // Hi There I'm unknowingly using template method
    //though I just noticed It was better to make classes:
    // (Dealer, Player , PlayingGround) interfaces than abstract classes

    public  void  shuffle(){
        int half=this.deck.size()/2; //здесь мы смело делим длину массива пополам
        int shuffleTimes= (int) (Math.random()*(1000-80)+80);
        for(int j=0 ;j<shuffleTimes;j++){
            for(int i=0;i<half;i++) {
                deck.set(i * 2, deck.get(i + half)); //и используем в качестве индекса
                deck.set(i * 2 + 1, deck.get(i));
            }
        }
    }
    // make deal template method



    public boolean hasInRange(int start, int end){
        ArrayList<PlayingCard> cards = getPlayingCards();
        int count = 0;
        for(PlayingCard card : cards){
            count += card.numeric.value;
        }
        return (count >= start && count <=end);
    }
    public boolean hasMoreThan(int max){
        ArrayList<PlayingCard> cards = this.getPlayingCards();
        int count = 0;
        for (PlayingCard card :cards ){
            count += card.numeric.value;
        }
        return count > max;
    }
    public int handCount(){
        ArrayList<PlayingCard> cards = getPlayingCards();
        int count = 0;
        for(PlayingCard card : cards){
            count += card.numeric.value;
        }
        return count ;
    }

}
