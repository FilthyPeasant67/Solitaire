package sample;

public class Main {
        public static void main(String[] args) {

//            String oneCard = "2 of Hearts";
//            String twoCard = "3 of Hearts";
//            String threeCard = "4 of Hearts";
//            String fourCard = "5 of Hearts";
//            String fiveCard = "6 of Hearts";
//            String sixCard = "7 of Hearts";
//            String sevenCard = "8 of Hearts";
//            String eightCard = "9 of Hearts";
//            String nineCard = "10 of Hearts";
//            String tenCard = "Jack of Hearts";
//            String elevenCard = "Queen of Hearts";
//            String twelveCard = "King of Hearts";
//            String thirteenCard = "Ace of Hearts";
//            String fourteenCard = "2 of Diamonds";
//            String fifteenCard = "3 of Diamonds";
//            String sixteenCard = "4 of Diamonds";
//            String seventeenCard = "5 of Diamonds";
//            String eighteenCard = "6 of Diamonds";
//            String nineteenCard = "7 of Diamonds";
//            String twentyCard = "8 of Diamonds";
//            String twentyoneCard = "9 of Diamonds";
//            String twentytwoCard = "10 of Diamonds";
//            String twentythreeCard = "Jack of Diamonds";
//            String twentyfourCard = "Queen of Diamonds";
//            String twentyfiveCard = "King of Diamonds";
//            String twentysixCard = "Ace of Diamonds";
//            String twentysevenCard = "2 of Clubs";
//            String twentyeightCard = "3 of Clubs";
//            String twentynineCard = "4 of Clubs";
//            String thirtyCard = "5 of Clubs";
//            String thirtyoneCard = "6 of Clubs";
//            String thirtytwoCard = "7 of Clubs";
//            String thirtythreeCard = "8 of Clubs";
//            String thirtyfourCard = "9 of Clubs";
//            String thirtyfiveCard = "10 of Clubs";
//            String thirtysixCard = "Jack of Clubs";
//            String thirtysevenCard = "Queen of Clubs";
//            String thirtyeightCard = "King of Clubs";
//            String thirtynineCard = "Ace of Clubs";
//            String fourtyCard = "2 of Spades";
//            String fourtyoneCard = "3 of Spades";
//            String fourtytwoCard = "4 of Spades";
//            String fourtythreeCard = "5 of Spades";
//            String fourtyfourCard = "6 of Spades";
//            String fourtyfiveCard = "7 of Spades";
//            String fourtysixCard = "8 of Spades";
//            String fourtysevenCard = "9 of Spades";
//            String fourtyeightCard = "10 of Spades";
//            String fourtynineCard = "Jack of Spades";
//            String fiftyCard = "Queen of Spades";
//            String fiftyoneCard = "King of Spades";
//            String fiftytwoCard = "Ace of Spades";
//            String[] deck = {oneCard,
//                    twoCard,
//                    threeCard,
//                    fourCard,
//                    fiveCard,
//                    sixCard,
//                    sevenCard,
//                    eightCard,
//                    nineCard,
//                    tenCard,
//                    elevenCard,
//                    twelveCard,
//                    thirteenCard,
//                    fourteenCard,
//                    fifteenCard,
//                    sixteenCard,
//                    seventeenCard,
//                    eighteenCard,
//                    nineteenCard,
//                    twentyCard,
//                    twentyoneCard,
//                    twentytwoCard,
//                    twentythreeCard,
//                    twentyfourCard,
//                    twentyfiveCard,
//                    twentysixCard,
//                    twentysevenCard,
//                    twentyeightCard,
//                    twentynineCard,
//                    thirtyCard,
//                    thirtyoneCard,
//                    thirtytwoCard,
//                    thirtythreeCard,
//                    thirtyfourCard,
//                    thirtyfiveCard,
//                    thirtysixCard,
//                    thirtysevenCard,
//                    thirtyeightCard,
//                    thirtynineCard,
//                    fourtyCard,
//                    fourtyoneCard,
//                    fourtytwoCard,
//                    fourtythreeCard,
//                    fourtyfourCard,
//                    fourtyfiveCard,
//                    fourtysixCard,
//                    fourtysevenCard,
//                    fourtyeightCard,
//                    fourtynineCard,
//                    fiftyCard,
//                    fiftyoneCard,
//                    fiftytwoCard};
//            for (int i = 0; i < deck.length; i++)
//                System.out.println(deck[i]);
//        }

//            cardValue % 4 = ?? // 0 = Hearts
                               // 1 = Club
                               // 2 = Diamond
                               // 3 = Spade
//            cardValue % 13 = ?? // 0 = 1
                                // 1 = 2
                                // 2 = 3
                                // 9 = 10
                                // 10 = Jack
                                // 11 = Queen
                                // 12 = King

            int[] deck = new int[52];
            for (int i = 0; i < 52; i++) {
                deck[i] = i + 1;
            }

            String[] SUITS = {"Hearts", "Club", "Diamond", "Spade"};
            String[] VALUES = {"Ace", "2", "3", "4", "5", "6", "7",
                                            "8", "9", "10", "Jack", "Queen", "King"};
            for (int i = 0; i < 52; i++) {
                String suit = " ", value = " ";
                suit = SUITS[i / 13];
                value = VALUES[i % 13];
                System.out.println(value + " of " + suit);
            }
        }
    }






