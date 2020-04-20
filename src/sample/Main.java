package sample;
import java.util.Scanner;
import java.util.Random;

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
        int wallet = 5000;
        int bet = 0;
        int[] playerHand = new int[10];
        int[] dealerHand = new int [10];
        Situation situation = new Situation(playerHand, dealerHand);
        while (1 > 0) {
            switch(phase) {
                case TITLESCREEN:
                    executeTitleScreen();
                    phase = Phase.BETTINGSCREEN;
                    break;
                case BETTINGSCREEN:
                    bet = executeBettingScreen(wallet);
                    phase = Phase.INITIATESCREEN;
                    break;
                case INITIATESCREEN:
                    situation = initiateBlackjack();
                    playerHand = situation.playerHand;
                    dealerHand = situation.dealerHand;
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
                    resultsPhase(bet, wallet);
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
        System.out.println("Welcome to Blackjack!");
    }

    /**
     * Initialize the betting screen
     */
    public static int executeBettingScreen(int wallet) {
        // insert code here
        //
        System.out.println("Place your bet");
        System.out.println("Bet has to be between $0 - " + wallet);
        Scanner playerBet = new Scanner(System.in);

        int bet = playerBet.nextInt();
        System.out.println("You've entered $" +bet);


    return bet;
    }

    /**
     * have dealer give two cards to himself and you
     */
    public static Situation initiateBlackjack() {

        /** Give CPU card **/
        int dealerHand[] = new int[10];
        int playerHand[] = new int[10];

        for (int i = 0; i < 4; i++) {
            boolean newCardDrawn = false;
            int card = 1;
            while(newCardDrawn == false) {
                Random rand = new Random();
                card = rand.nextInt(52) + 1;
                if (dealerHand[0] == card || dealerHand[1] == card) {}
                else if (playerHand[0] == card || playerHand[1] == card) {}
                else { newCardDrawn = true; }
            }

            // check to see if card has already been drawn
            if (i % 2 == 0) { // if remainder = 0
                int index = i / 2;
                dealerHand[index] = card;
            } else {
                int index = i / 2;
                playerHand[index] = card;
            }
        }
        Situation situation = new Situation(playerHand, dealerHand);
        return situation;

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
    public static void resultsPhase(int bet, int wallet) {
        // if player wins
        wallet += bet;
        // else
        wallet -= bet;
        // insert code here
    }
}






