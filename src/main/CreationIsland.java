package main;

public class CreationIsland {

    private final int NEW_LAND = 1;
    private int areaMin = 0;
    private int areaMax = 0;
    public  CreationIsland(int areaMin, int areaMax){
        this.areaMin = areaMin;
        this.areaMax = areaMax;
    }

    public int[][] generateIsland() {
        int defaultWidth = (int)(this.areaMin + Math.random() * this.areaMax);
        int defaultHeight = (int)(this.areaMin + Math.random() * this.areaMax);
        int [][] temp = new int[defaultWidth][defaultHeight];

        for(int location = 0;location < defaultWidth * defaultHeight / 2; location++) {
            temp[(int) (Math.random() * defaultWidth)][(int) (Math.random() * defaultHeight)] = NEW_LAND;
        }



        return temp;
    }
}
