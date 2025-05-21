package pl.lukaszdude.katatreningjava.makaogame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Player {

    private final String name;
    private final boolean isCpu;
    private List<Card> handCards;

    public Player(String name, boolean isCpu) {
        this.name = name;
        this.isCpu = isCpu;
    }

    public void addCard(Card card) {
        handCards.add(card);
    }

    public void subCard(Card card) {
        handCards.remove(card);
    }

    public String getName() {
        return name;
    }

    public boolean isCpu() {
        return isCpu;
    }

    public String showCards() {
        return IntStream.range(0, handCards.size())
                .mapToObj(i -> (i + 1) + ". " + handCards.get(i))
                .collect(Collectors.joining("\n"));
    }

    public int getCardCount() {
        return handCards.size();
    }
}
