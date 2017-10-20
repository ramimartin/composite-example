package com.rarmimartin.patterns.state.states;

public class DeathState implements State {
    @Override
    public Integer run() {
        throw new ImDeathException("Estoy muerto!");

    }

    private class ImDeathException extends RuntimeException {

        ImDeathException(String message) {
            super(message);
        }
    }
}
