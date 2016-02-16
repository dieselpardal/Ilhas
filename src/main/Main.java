package main;

public class Main {


    public static void main(String[] args) {

        CreationIsland creationIsland = new CreationIsland(1,10);

        Sea setIsland = new Sea(creationIsland.generateIsland());

        setIsland.printSea();

        System.out.println("-----------------");

        System.out.println("Sao " + setIsland.searchHowManyIsland() + " ilhas.");

        }
}
