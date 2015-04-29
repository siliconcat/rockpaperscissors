package rps;

import java.util.function.Supplier;

public enum Throw {

    ROCK(new Supplier<Throw>() {
        @Override
        public Throw get() {
            return SCISSORS;
        }
    }),
    SCISSORS(new Supplier<Throw>() {
        @Override
        public Throw get() {
            return PAPER;
        }
    }),
    PAPER(new Supplier<Throw>() {
        @Override
        public Throw get() {
            return ROCK;
        }
    });


    private final Supplier<Throw> loser;

    Throw(Supplier<Throw> loser) {
        this.loser = loser;
    }

    public Outcome against(Throw throwToBeat) {
        if (loser.get() == throwToBeat) {
            return Outcome.VICTORY;
        } else if (this == throwToBeat) {
            return Outcome.TIE;
        }
        return Outcome.DEFEAT;
    }
}
