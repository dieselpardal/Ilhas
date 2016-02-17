package islands;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CountIslandsTest {

    @Test
    public void souldTestThreeIslandsExist() {

        int[][] SetIslands = {{0, 0, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0, 1}, {1, 1, 0, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.searchHowManyIsland(), is(3));
    }

    @Test
    public void souldIslandsValid() {

        int[][] SetIslands = {{1, 1, 0, 1, 0, 1}, {0, 1, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.searchHowManyIsland(), is(2));
    }

    @Test
    public void souldCheckIslandExistValid() {

        int[][] SetIslands = {{1, 1, 0, 1, 0, 1}, {0, 1, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.checkIslandExist(), is(true));
    }

    @Test
    public void souldCheckLimitAreaTopAndLeftOnOceanValid() {

        int[][] SetIslands = {{1, 1, 0, 1, 0, 1}, {0, 1, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.checkLimitAreaTopAndLeftOnOcean(0, 0), is(true));
    }

    @Test
    public void souldCheckLimitAreaBottomAndRightOnOceanValid() {

        int[][] SetIslands = {{1, 1, 0, 1, 0, 1}, {0, 1, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.checkLimitAreaBottomAndRightOnOcean(3, 5), is(true));
    }

    @Test
    public void souldDetectFirstLandValid() {

        int[][] SetIslands = {{1, 1, 0, 1, 0, 1}, {0, 1, 1, 0, 0,1}, {1, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.detectFirstLand(1, 1), is(true));
    }

    @Test
    public void souldTestIslandNotExist() {

        int[][] setIslands = {{0, 0}, {0, 0}};
        CountIslands setIsland = new CountIslands(setIslands);
        assertThat(setIsland.searchHowManyIsland(), is(0));
    }

    @Test
    public void souldTestIslandFull() {

        int[][] setIslands = {{1, 1}, {1, 1}};
        CountIslands setIsland = new CountIslands(setIslands);
        assertThat(setIsland.searchHowManyIsland(), is(1));
    }

    @Test
    public void souldTestSeaEmpty() {

        int[][] setIslands = null;
        CountIslands setIsland = new CountIslands(setIslands);
        assertThat(setIsland.searchHowManyIsland(), is(0));
    }
}
