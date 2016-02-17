package islands;

import java.lang.Math;

public class CreationIsland {

    private final int NEW_LAND = 1;
    private int areaMin = 0;
    private int areaMax = 0;
    private int defaultWidth = 0;
    private int defaultHeight = 0;

    public CreationIsland(int areaMin, int areaMax) {
        this.areaMin = areaMin;
        this.areaMax = areaMax;
    }

    private int getLocationHorizontalRandom() {
        return (int) (Math.random() * this.defaultWidth);
    }

    private int getLocationVerticalRandom() {
        return (int) (Math.random() * this.defaultHeight);
    }

    private int getUnitAreaRandom() {
        return (int) (this.areaMin + Math.random() * (this.areaMax - this.areaMin));
    }

    private void setNewAreaRandom() {
        this.defaultWidth = getUnitAreaRandom();
        this.defaultHeight = getUnitAreaRandom();
    }

    private int getMeanArea() {
        return defaultWidth * defaultHeight / 2;
    }

    public int[][] generateIsland() {
        setNewAreaRandom();
        int[][] temp = new int[defaultWidth][defaultHeight];
        for (int location = 0; location < getMeanArea(); location++) {
            temp[getLocationHorizontalRandom()][getLocationVerticalRandom()] = NEW_LAND;
        }
        return temp;
    }
}
