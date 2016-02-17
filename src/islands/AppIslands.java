package islands;

import java.lang.String;
import java.lang.System;

public class AppIslands {


    public static void main(String[] args) {

        CreationIsland creationIsland = new CreationIsland(1, 10);

        CountIslands setIsland = new CountIslands(creationIsland.generateIsland());

        setIsland.printCountIslandsAndArea();

        System.out.println("-----------------");

        System.out.println("Sao " + setIsland.searchHowManyIsland() + " ilhas.");

    }
}
