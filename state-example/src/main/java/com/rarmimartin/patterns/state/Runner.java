package com.rarmimartin.patterns.state;

import com.rarmimartin.patterns.state.states.HappyState;
import com.rarmimartin.patterns.state.states.State;

public class Runner {
    private String name;

    private State state;

    private Integer runKms;

    public Runner(String name) {
        this.name = name;
        this.state = new HappyState();
        this.runKms = 0;
    }

    public void run() {
        runKms += state.run();
    }

    public void setState(State state) {
        this.state = state;
    }

    public Integer getRunKms() {
        return runKms;
    }

    public String getName() {
        return name;
    }
}
