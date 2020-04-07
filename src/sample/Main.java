package sample;

public class Main {
    public static void main(String[] args) {
        // Main logic for blackjack
        // 1. Lets have a title screen
        // 2. how much moneys do you want to put down?
        // 3. Dealer gets two cards and user gets two cards
        // 4. Determine whether to hit, split, hold, double, insurance
        // 5. Dealer does the hittings
        // 6. Either give a win screen or lose screen. Be sure to either take away money or give money bet
        int phase = 1;
        while (1 > 0) {
            switch(phase) {
                case 1:
                    executeTitleScreen();
                    phase = 2;
                    break;
                case 2:
                    executeBettingScreen();
                    phase = 3;
                    break;
                case 3:
                    initiateBlackjack();
                    phase = 4;
                    break;
                case 4:
                    playerPhase();
                    phase = 5; // either 5 or 6
                    break;
                case 5:
                    cpuPhase();
                    phase = 6;
                    break;
                case 6:
                    resultsPhase();
                    phase = 2;
                    break;
                }
            }
        }

    /**
     * Show title screen for blackjack
     */
    public static void executeTitleScreen() {
            // insert code here
    }

    /**
     * Initialize the betting screen
     */
    public static void executeBettingScreen() {
        // insert code here
    }

    /**
     * have dealer give two cards to himself and you
     */
    public static void initiateBlackjack() {
        Deck deck = new Deck();
//        shuffleDeck(deck);
        /** Give CPU card **/
        /** Give Player card **/
        /** Give CPU another card **/
        /** Give Player card **/
        // insert code here
    }

    /**
     * User decides what to do with their cards
     */
    public static void playerPhase() {
        // insert code here
    }

    /**
     * CPU decides what to do with their hand/hands
     */
    public static void cpuPhase() {
        // insert code here
    }

    /**
     * Either give a winning screen or losing screen
     */
    public static void resultsPhase() {
        // insert code here
    }
}






