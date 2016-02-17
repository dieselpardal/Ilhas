package islands;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class CreationIslandTest {

    @Test
    public void souldTestMinimeOneIslandRandomExist() {

        CreationIsland creationIsland = new CreationIsland(1, 10);
        assertThat(creationIsland.generateIsland(), is(not(equalTo(0))));
    }

    @Test
    public void souldTestMaximoTenAreaRandomExist() {

        CreationIsland creationIsland = new CreationIsland(10, 10);
        assertThat(creationIsland.generateIsland().length, is(equalTo(10)));
    }

    @Test
    public void souldTestOnlyOneAreaRandomExist() {

        CreationIsland creationIsland = new CreationIsland(1, 1);
        assertThat(creationIsland.generateIsland().length, is(equalTo(1)));
    }

    @Test
    public void souldTestIslandRandomEmpty() {

        int[][] tempEmpty = new int[0][0];
        CreationIsland creationIsland = new CreationIsland(0, 0);
        assertThat(creationIsland.generateIsland(), is((equalTo(tempEmpty))));
    }
}
