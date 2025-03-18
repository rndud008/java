package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        intitCard();
        shuffle();
    }

    public Card drawCard(){
//        return cards.remove(0);
        return cards.removeFirst(); // java 21 기능.
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    private void intitCard() {
        for (int i = 0; i < 13; i++) {

            Suit[] values = Suit.values();
            for (Suit suit : values) {
                cards.add(new Card(i, suit));
            }
//            cards.add(new Card(i, Suit.SPADE));
//            cards.add(new Card(i, Suit.HEART));
//            cards.add(new Card(i, Suit.DIAMOND));
//            cards.add(new Card(i, Suit.CLUB));
        }
    }
}
