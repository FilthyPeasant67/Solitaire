package sample;

public class Main {
        public static void main(String[] args) {

            Deck one = new Deck();
            for (int i = 0; i < 52; i++) {
//                Card card = one.getCardAt(i);
                Card card = one.deck.get(i);
                System.out.println(card.value + " of " + card.suit);
            }
        }
    }






