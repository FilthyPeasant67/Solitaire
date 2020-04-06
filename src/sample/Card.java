package sample;

public class Card {
    String[] SUITS = {"Hearts", "Club", "Diamond", "Spade"};
    String[] VALUES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String suit, value;

    public Card(int suit, int value) {
        this.suit = SUITS[suit];
        this.value = VALUES[value];
    }
}
