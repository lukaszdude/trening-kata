package pl.lukaszdude.katatreningjava.makaogame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<Card> cards;
    private final List<Card> stackOfCards;

    public Deck() {
        this.cards = new ArrayList<>();
        this.stackOfCards = new ArrayList<>();
        initDeck();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> dealCards(int numberOfCards) {
        List<Card> cardsToDeal = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            if (cards.isEmpty())
                reloadDeck();
            cardsToDeal.add(cards.remove(i));
        }
        return cardsToDeal;
    }

    private void initDeck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                Card card = createCard(suit, rank);
                addCard(card);
            }
        }
    }

    private Card createCard(Card.Suit suit, Card.Rank rank) {
        Card card;
        switch (rank) {
            case TWO:
                card = new CombatCard(suit, rank, 2, false, false, false);
                break;
            case THREE:
                card = new CombatCard(suit, rank, 3, false, false, false);
                break;
            case FOUR:
                card = new CombatCard(suit, rank, 0, false, false, false);
                break;
            case JACK:
                card = new CombatCard(suit, rank, 0, false, true, false);
                break;
            case KING:
                if (suit == Card.Suit.HEARTS || suit == Card.Suit.SPADES)
                    card = new CombatCard(suit, rank, 5, false, false, false);
                else
                    card = new Card(suit, rank);
                break;
            case ACE:
                card = new CombatCard(suit, rank, 0, true, false, false);
                break;
            default:
                card = new Card(suit, rank);
        }
        return card;
    }

    private void reloadDeck() {
        cards.addAll(stackOfCards);
        this.shuffle();
        stackOfCards.clear();
    }
}
