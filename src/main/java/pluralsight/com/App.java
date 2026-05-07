package pluralsight.com;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for Player 1: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter name for Player 2: ");
        String name2 = scanner.nextLine();

        scanner.close();

        Deck deck = new Deck();
        deck.shuffle();
        Hand hand1 = new Hand(name1);

        Deck deck2 = new Deck();
        deck2.shuffle();
        Hand hand2 = new Hand(name2);

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


        Hand winner = null;
        int best = 0;
        boolean tie = false;

        Hand[] hands = {hand1, hand2};
        int[] values = {handValue, handValue2};

        for (int i = 0; i < hands.length; i++) {
            if (values[i] <= 21 && values[i] > best) {
                best = values[i];
                winner = hands[i];
                tie = false;
            } else if (values[i] <= 21 && values[i] == best) {
                tie = true;
            }
        }


        if (winner == null) {
            System.out.println("All players bust! No winner.");
        } else if (tie) {
            System.out.println("It's a tie at " + best + "!");
        } else {
            System.out.println(winner.getName() + " wins with " + best + "!");


        }
    }



    }

