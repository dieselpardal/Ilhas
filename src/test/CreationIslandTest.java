package test;

import main.CreationIsland;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class CreationIslandTest {

    @Test
    public void souldTestMinimeOneIslandRandomExist() {

        CreationIsland creationIsland = new CreationIsland(1,10);
        assertThat(creationIsland.generateIsland(), is(not(equalTo(0))));
    }
    @Test
    public void souldTestIslandRandomEmpty() {
        int[][]tempEmpty = new int[0][0];
        CreationIsland creationIsland = new CreationIsland(0,0);
        assertThat(creationIsland.generateIsland(), is((equalTo(tempEmpty))));
    }
}
