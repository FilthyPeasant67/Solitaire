package sample;
import java.util.ArrayList;

public class Deck {

//    private ArrayList<Card> deck;
    ArrayList<Card> deck;
    int SUITMAX = 4, VALUEMAX = 13;

    public Deck() {
        deck = new ArrayList<Card>();
        for (int suit = 0; suit < SUITMAX; suit++) {
            for (int value = 0; value < VALUEMAX; value++) {
                deck.add(new Card(suit, value));
            }
        }
    }

//    public Card getCardAt(int index) {
//        if (withinBounds(index)) {
//            return deck.get(index);
//        }
//        return null;
//    }

//    private boolean withinBounds(int i) {
//        return (i >= 0 && i < deck.size());
//    }

}
