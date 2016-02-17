package islands;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CountIslandsTest {

    @Test
    public void shouldTestThreeIslandsExist() {

        int[][] SetIslands = {{0, 0, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0, 1}, {1, 1, 0, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.searchHowManyIsland(), is(3));
    }

    @Test
    public void shouldIslandsValid() {

        int[][] SetIslands = {{1, 1, 0, 1, 0, 1}, {0, 1, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.searchHowManyIsland(), is(2));
    }

    @Test
    public void shouldCheckIslandExistValid() {

        int[][] SetIslands = {{1, 1, 0, 1, 0, 1}, {0, 1, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.checkIslandExist(), is(true));
    }

    @Test
    public void shouldCheckLimitAreaTopAndLeftOnOceanValid() {

        int[][] SetIslands = {{1, 1, 0, 1, 0, 1}, {0, 1, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.checkLimitAreaTopAndLeftOnOcean(0, 0), is(true));
    }

    @Test
    public void shouldCheckLimitAreaBottomAndRightOnOceanValid() {

        int[][] SetIslands = {{1, 1, 0, 1, 0, 1}, {0, 1, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.checkLimitAreaBottomAndRightOnOcean(3, 5), is(true));
    }

    @Test
    public void shouldDetectFirstLandValid() {

        int[][] SetIslands = {{1, 1, 0, 1, 0, 1}, {0, 1, 1, 0, 0,1}, {1, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0}};
        CountIslands setIsland = new CountIslands(SetIslands);
        assertThat(setIsland.detectFirstLand(1, 1), is(true));
    }

    @Test
    public void shouldTestIslandNotExist() {

        int[][] setIslands = {{0, 0}, {0, 0}};
        CountIslands setIsland = new CountIslands(setIslands);
        assertThat(setIsland.searchHowManyIsland(), is(0));
    }

    @Test
    public void shouldTestIslandFull() {

        int[][] setIslands = {{1, 1}, {1, 1}};
        CountIslands setIsland = new CountIslands(setIslands);
        assertThat(setIsland.searchHowManyIsland(), is(1));
    }

    @Test
    public void shouldTestSeaEmpty() {

        int[][] setIslands = null;
        CountIslands setIsland = new CountIslands(setIslands);
        assertThat(setIsland.searchHowManyIsland(), is(0));
    }
}
