package sample;

public class Main {
        public static void main(String[] args) {

            Deck deck = new Deck();
            for (int i = 0; i < 52; i++) {
                Card card = deck.getCardAt(i);
                System.out.println(card.value + " of " + card.suit);
            }
            // Main logic for blackjack
            // 1. Lets have a title screen
            //        // 2. how much moneys do you want to put down?
            //        // 3. Dealer gets two cards and user gets two cards
            //        // 4. Determine whether to hit, split, hold, double, insurance
            //        // 5. Dealer does the hittings
            //        // 6. Either give a win screen or lose screen. Be sure to either take away money or give money bet
            int phase = 1;
            while (1 > 0) {
                if (phase == 1) {
                    executeTitleScreen();
                    phase = 2;
                } else if (phase == 2) {
                    executeBettingScreen();
                    phase = 3;
                } else if (phase == 3) {
                    initiateBlackjack();
                    phase = 4;
                } else if (phase == 4) {
                    playerPhase();
                    phase = 5; // either 5 or 6
                } else if (phase == 5) {
                    CPUPhase();
                    phase = 6;
                } else if (phase == 6) {
                    resultsPage();
                    phase = 2;
                }
            }
        }
    }






