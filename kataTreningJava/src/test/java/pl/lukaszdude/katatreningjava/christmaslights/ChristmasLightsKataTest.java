package pl.lukaszdude.katatreningjava.christmaslights;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChristmasLightsKataTest {

    @Test
    void shouldReturnCorrectNumberOfLightsReadmeExample() {
        ChristmasLightsKata lightGrid = new ChristmasLightsKata(1000, 1000);
        lightGrid.turnOn(0, 0, 999, 999);
        lightGrid.toggle(0, 0, 999, 0);
        lightGrid.turnOff(499, 499, 500, 500);

        int lightsOn = lightGrid.countLightsOn();
        assertEquals(998996, lightsOn);
    }

    @Test
    void shouldReturnCorrectNumberOfLightsAfterInstructionsThousandByThousandArray() {
        ChristmasLightsKata lightGrid = new ChristmasLightsKata(1000, 1000);
        lightGrid.turnOn(887, 9, 959, 629);
        lightGrid.turnOn(454, 398, 844, 448);
        lightGrid.turnOff(539, 243, 559, 965);
        lightGrid.turnOff(370, 819, 370, 819);
        lightGrid.turnOff(145, 40, 370, 997);
        lightGrid.turnOff(301, 3, 808, 453);
        lightGrid.turnOn(351, 678, 951, 908);
        lightGrid.toggle(720, 196, 720, 196);
        lightGrid.toggle(831, 394, 904, 860);

        int lightsOn = lightGrid.countLightsOn();
        assertEquals(183551, lightsOn);
    }

    @Test
    void shouldReturnCorrectNumberOfLightsAfterInstructionsHundredByHundredArray() {
        ChristmasLightsKata lightGrid = new ChristmasLightsKata(100, 100);
        lightGrid.turnOn(0, 0, 49, 49);
        lightGrid.toggle(25, 25, 74, 74);
        lightGrid.turnOff(10, 10, 19, 19);
        lightGrid.turnOn(90, 90, 99, 99);
        lightGrid.toggle(0, 90, 9, 99);

        int lightsOn = lightGrid.countLightsOn();
        assertEquals(3850, lightsOn);
    }

    @Test
    void shouldReturnCorrectNumberOfLightsAfterInstructionsTenByTenArray() {
        ChristmasLightsKata lightGrid = new ChristmasLightsKata(10, 10);
        lightGrid.turnOn(0, 0, 9, 9);
        lightGrid.turnOff(0, 0, 4, 4);
        lightGrid.toggle(8, 8, 9, 9);

        int lightsOn = lightGrid.countLightsOn();
        assertEquals(71, lightsOn);
    }
}
