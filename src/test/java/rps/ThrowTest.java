package rps;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static rps.Throw.*;

public class ThrowTest {

    @Test
    public void rockBeatsScissors() throws Exception {
        assertThat(ROCK.against(SCISSORS), is(Outcome.VICTORY));
    }

    @Test
    public void scissorsBeatsPaper() throws Exception {
        assertThat(SCISSORS.against(PAPER), is(Outcome.VICTORY));
    }

    @Test
    public void paperBeatsRock() throws Exception {
        assertThat(PAPER.against(ROCK), is(Outcome.VICTORY));
    }

    @Test
    public void scissorsDoesNotBeatRock() throws Exception {
        assertThat(SCISSORS.against(ROCK), is(Outcome.DEFEAT));
    }

    @Test
    public void paperDoesNotBeatScissors() throws Exception {
        assertThat(PAPER.against(SCISSORS), is(Outcome.DEFEAT));
    }

    @Test
    public void rockDoesNotBeatPaper() throws Exception {
        assertThat(ROCK.against(PAPER), is(Outcome.DEFEAT));
    }

    @Test
    public void aRoundCanBeTied() throws Exception {
        assertThat(ROCK.against(ROCK), is(Outcome.TIE));
    }


}
