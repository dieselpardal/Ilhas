package test;

import main.Sea;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SeaTest {

    @Test
    public void souldTestThreeIslandsExist() {

        int[][] SetIslands = {{0, 0, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0, 1}, {1, 1, 0, 0, 0}};
        Sea setIsland = new Sea(SetIslands);
        assertThat(setIsland.searchHowManyIsland(), is(3));
    }

    @Test
    public void souldTestIslandNotExist() {

        int[][] setIslands = {{0, 0}, {0, 0}};
        Sea setIsland = new Sea(setIslands);
        assertThat(setIsland.searchHowManyIsland(), is(0));
    }

    @Test
    public void souldTestIslandFull() {

        int[][] setIslands = {{1, 1}, {1, 1}};
        Sea setIsland = new Sea(setIslands);
        assertThat(setIsland.searchHowManyIsland(), is(1));
    }

    @Test
    public void souldTestSeaEmpty() {

        int[][] setIslands = null;
        Sea setIsland = new Sea(setIslands);
        assertThat(setIsland.searchHowManyIsland(), is(0));
    }
}


