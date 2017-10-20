package com.rarmimartin.patterns.state.states;

public class HappyState implements State {
    @Override
    public Integer run() {
        System.out.println("Soy feliz, corro rápido");
        return 10;
    }
}
