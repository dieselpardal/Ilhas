package islands;

import java.lang.System;

public class CountIslands {

    private final int FIRST_STEP = 0;
    private final int BUSY = 2;
    private final int EXIST_LAND = 1;
    private final int NEXT_LAND = 1;
    private int widthMatrix = 0;
    private int heightMatrix = 0;
    private int[][] matrix;

    public CountIslands(int[][] matrix) {
        this.matrix = matrix;
        if (this.matrix != null) {
            this.widthMatrix = this.matrix.length;
            if (this.widthMatrix > FIRST_STEP) {
                this.heightMatrix = this.matrix[FIRST_STEP].length;
            }
        }
    }

    protected boolean checkIslandExist() {
        return this.widthMatrix > FIRST_STEP && this.heightMatrix > FIRST_STEP;
    }

    protected boolean detectFirstLand(int getWidth, int getHeight) {
        return this.matrix[getWidth][getHeight] == EXIST_LAND;
    }

    protected boolean checkLimitAreaTopAndLeftOnOcean(int locationHorizontal, int locationVertical) {
        return locationHorizontal >= FIRST_STEP && locationVertical >= FIRST_STEP;
    }

    protected boolean checkLimitAreaBottomAndRightOnOcean(int locationHorizontal, int locationVertical) {
        return locationHorizontal < this.widthMatrix && locationVertical < this.heightMatrix;
    }

    private boolean checkLimitAreaOnOcean(int locationHorizontal, int locationVertical) {
        return checkLimitAreaTopAndLeftOnOcean(locationHorizontal, locationVertical) && checkLimitAreaBottomAndRightOnOcean(locationHorizontal, locationVertical);
    }

    private boolean checkLimitAreaAndDetectFirstIslandOnOcean(int locationHorizontal, int locationVertical) {
        return checkLimitAreaOnOcean(locationHorizontal, locationVertical) && detectFirstLand(locationHorizontal, locationVertical);
    }

    private void onIslandPerimeter(int getWidth, int getHeight) {
        this.matrix[getWidth][getHeight] = BUSY;

        for (int locationHorizontal = getWidth - NEXT_LAND; locationHorizontal <= getWidth + NEXT_LAND; locationHorizontal++) {
            for (int locationVertical = getHeight - NEXT_LAND; locationVertical <= getHeight + NEXT_LAND; locationVertical++) {
                if (checkLimitAreaAndDetectFirstIslandOnOcean(locationHorizontal, locationVertical)) {
                    onIslandPerimeter(locationHorizontal, locationVertical);
                }
            }
        }
    }

    public int searchHowManyIsland() {
        int totalIsland = 0;

        if (checkIslandExist()) {
            for (int locationHorizontal = FIRST_STEP; locationHorizontal < this.widthMatrix; locationHorizontal++) {
                for (int locationVertical = FIRST_STEP; locationVertical < this.heightMatrix; locationVertical++) {
                    if (detectFirstLand(locationHorizontal, locationVertical)) {
                        totalIsland++;
                        onIslandPerimeter(locationHorizontal, locationVertical);
                    }
                }
            }
        }

        return totalIsland;
    }

    public void printCountIslandsAndArea() {
        System.out.println("A area de conjunto das ilhas: " + this.widthMatrix + " x " + this.heightMatrix);
        for (int width = FIRST_STEP; width < this.widthMatrix; width++) {
            for (int height = FIRST_STEP; height < this.heightMatrix; height++) {
                System.out.print(this.matrix[width][height]);
            }
            System.out.println("");
        }
    }
}
