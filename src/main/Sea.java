package main;

public class Sea {

     private final int FIRST_STEP = 0;
     private final int BUSY = 2;
     private final int EXIST_LAND = 1;
     private final int NEXT_LAND = 1;
     private int widthMatrix = 0;
     private int heightMatrix = 0;
     private int[][] matrix;

     public Sea(int[][] matrix) {
        this.matrix = matrix;
        if( this.matrix != null) {
            this.widthMatrix =  this.matrix.length;
            if( this.widthMatrix > FIRST_STEP) {
                this.heightMatrix = this.matrix[FIRST_STEP].length;
            }
        }
     }

     private boolean IslandExist() {
        return this.widthMatrix > FIRST_STEP && this.heightMatrix > FIRST_STEP;
     }

     private boolean detectFirstLand(int getWidth, int getHeight) {
            return this.matrix[getWidth][getHeight] == EXIST_LAND ;
     }

     private void onIslandPerimeter(int getWidth, int getHeight) {
        this.matrix[getWidth][getHeight] = BUSY;

        for(int width = getWidth - NEXT_LAND; width <= getWidth + NEXT_LAND; width++) {
            for (int height = getHeight - NEXT_LAND; height <= getHeight + NEXT_LAND; height++) {
                if((width >= FIRST_STEP && height >= FIRST_STEP) && (width < this.widthMatrix && height < this.heightMatrix)) {
                    if (detectFirstLand(width, height))  {
                        onIslandPerimeter(width, height);
                    }
                }
            }
        }
     }

     public int searchHowManyIsland() {
         int totalIsland = 0;

         if( IslandExist()) {
             for(int width = FIRST_STEP; width < this.widthMatrix; width++) {
                 for(int height= FIRST_STEP; height < this.heightMatrix; height++) {
                     if (detectFirstLand(width, height)) {
                         totalIsland++;
                         onIslandPerimeter(width, height);
                     }
                 }
             }
         }

         return totalIsland;
     }

     public void printSea() {
         System.out.println("A area de Oceano: " + this.widthMatrix + " x " + this.heightMatrix);
         for (int width = FIRST_STEP; width < this.widthMatrix; width++) {
             for (int height = FIRST_STEP; height < this.heightMatrix; height++) {
                 System.out.print(this.matrix[width][height]);
             }
             System.out.println("");
         }
     }
}
