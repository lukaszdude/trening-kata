package pl.lukaszdude.katatreningjava.christmaslights;

class ChristmasLightsKata {

    private final int[][] lightsGrid;

    public ChristmasLightsKata(int x, int y) {
        this.lightsGrid = new int[x][y];
    }

    public void turnOn(int x1, int y1, int x2, int y2) {
        gridIterate(x1, y1, x2, y2, 1);
    }

    public void turnOff(int x1, int y1, int x2, int y2) {
        gridIterate(x1, y1, x2, y2, 0);
    }

    public void toggle(int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            for (int z = y1; z <= y2; z++) {
                lightsGrid[i][z] = (lightsGrid[i][z] == 0) ? 1 : 0;
            }
        }
    }

    public int countLightsOn() {
        int count = 0;
        for (int[] lightsRow : lightsGrid) {
            for (int light : lightsRow) {
                count += light;
            }
        }
        return count;
    }

    private void gridIterate(int x1, int y1, int x2, int y2, int instruction) {
        for (int i = x1; i <= x2; i++) {
            for (int z = y1; z <= y2; z++) {
                lightsGrid[i][z] = instruction;
            }
        }
    }
}
