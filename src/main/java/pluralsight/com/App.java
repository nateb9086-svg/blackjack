package pluralsight.com;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Hand hand1 = new Hand("Nate");

        Deck deck2 = new Deck();
        deck2.shuffle();
        Hand hand2 = new Hand("Tulip");

// deal 5 cards
        for(int i = 0; i < 2; i++) {
// get a card from the deck
            Card card = deck.deal();
// deal that card to the hand
            hand1.deal(card);
        }
        for(int i = 0; i < 2; i++) {
// get a card from the deck
            Card card = deck2.deal();
// deal that card to the hand
            hand2.deal(card);
        }

        int handValue = hand1.getValue();
        System.out.println(hand1.getName() + "'s hand is worth " + handValue);

        int handValue2 = hand2.getValue();
        System.out.println(hand2.getName() + "'s hand is worth " + handValue2);

    }
}
