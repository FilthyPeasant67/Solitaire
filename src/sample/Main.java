package sample;

enum Phase {
    TITLESCREEN, BETTINGSCREEN, INITIATESCREEN, PLAYERSCREEN,
    CPUSCREEN, RESULTSSCREEN
}

/** You may need to look into pass by val vs pass by ref **/
/** Need to determine how to pass in values within the console **/

public class Main {
    public static void main(String[] args) {
        // Main logic for blackjack
        // 1. Lets have a title screen
        // 2. how much moneys do you want to put down?
        // 3. Dealer gets two cards and user gets two cards
        // 4. Determine whether to hit, split, hold, double, insurance
        // 5. Dealer does the hittings
        // 6. Either give a win screen or lose screen. Be sure to either take away money or give money bet
        Phase phase = Phase.TITLESCREEN;
        int playerMoneyAmount = 5000;
        int bet = 0;
        while (1 > 0) {
            switch(phase) {
                case TITLESCREEN:
                    executeTitleScreen();
                    phase = Phase.BETTINGSCREEN;
                    break;
                case BETTINGSCREEN:
                    bet = executeBettingScreen(playerMoneyAmount);
                    phase = Phase.INITIATESCREEN;
                    break;
                case INITIATESCREEN:
                    initiateBlackjack();
                    phase = Phase.PLAYERSCREEN;
                    break;
                case PLAYERSCREEN:
                    playerPhase();
                    phase = Phase.CPUSCREEN; // either 5 or 6
                    break;
                case CPUSCREEN:
                    cpuPhase();
                    phase = Phase.RESULTSSCREEN;
                    break;
                case RESULTSSCREEN:
                    resultsPhase(bet, playerMoneyAmount);
                    phase = Phase.BETTINGSCREEN;
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
    public static int executeBettingScreen(int playerMoneyAmount) {
        // insert code here
        //
        System.out.println("Place your bet");
        System.out.println("Bet has to be between $100 - " + playerMoneyAmount);
        // figure out to insert values within console;
        int bet = 50;

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
    public static void resultsPhase(int bet, int playerMoneyAmount) {
        // if player wins
        playerMoneyAmount += bet;
        // else
        playerMoneyAmount -= bet;
        // insert code here
    }
}






