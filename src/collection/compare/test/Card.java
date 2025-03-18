package collection.compare.test;

public class Card implements Comparable<Card>{
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        // 숫자 비교후 숫자가 같으면 마크 비교

        if (this.rank != anotherCard.rank ){
            return Integer.compare(this.rank, anotherCard.rank);
        }

        return this.suit.compareTo(anotherCard.suit);
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
