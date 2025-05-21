package pl.lukaszdude.katatreningjava.makaogame;

import java.util.Scanner;
import java.util.logging.Logger;

public class MakaoGame {

    private final Logger logger = Logger.getLogger(getClass().getName());

    public void play() {
        try {
            int playersNumber = getPlayersAmount();
            initPlayers(playersNumber);
        } catch (Exception ex) {
            logger.info("BŁĄD: " + ex.getMessage());
        }
    }

    private int getPlayersAmount() throws Exception {
        Scanner scanner = new Scanner(System.in);
        logger.info("Podaj liczbę graczy (2-5): ");

        if (!scanner.hasNextInt())
            throw new Exception("To nie jest poprawna liczba całkowita.");

        int number = scanner.nextInt();
        if (number < 0 || number > 5)
            throw new Exception("Podano złą ilość graczy");

        scanner.close();
        return number;
    }

    private void initPlayers(int playersNumber) {

    }

}
