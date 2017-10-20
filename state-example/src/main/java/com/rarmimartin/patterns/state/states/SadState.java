package com.rarmimartin.patterns.state.states;

public class SadState implements State {
    @Override
    public Integer run() {
        System.out.println("Estoy triste, soy lento");
        return 1;
    }
}
