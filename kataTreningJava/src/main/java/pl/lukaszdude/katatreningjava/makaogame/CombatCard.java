package pl.lukaszdude.katatreningjava.makaogame;

public class CombatCard extends Card {

    private final int cardToTake;
    private final boolean canChangeSuit;
    private final boolean canDemandRank;
    private final boolean canStopPlayer;

    public CombatCard(Suit suit, Rank rank, int cardToTake, boolean canChangeSuit, boolean canDemandRank, boolean canStopPlayer) {
        super(suit, rank);
        this.cardToTake = cardToTake;
        this.canChangeSuit = canChangeSuit;
        this.canDemandRank = canDemandRank;
        this.canStopPlayer = canStopPlayer;
    }
}
