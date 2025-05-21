package pl.lukaszdude.katatreningjava;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            logger.info("Podałeś liczbę: " + number);
        } else {
            logger.info("To nie jest poprawna liczba całkowita.");
        }

        scanner.close();
    }
}
