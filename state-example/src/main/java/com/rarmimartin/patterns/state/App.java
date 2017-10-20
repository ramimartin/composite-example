package com.rarmimartin.patterns.state;

import com.rarmimartin.patterns.state.states.DeathState;
import com.rarmimartin.patterns.state.states.SadState;

public class App {

    public static void main(String[] args) {
        Runner runner = new Runner("Usain Bolt");
        runner.run();
        logRunner(runner);
        runner.setState(new SadState());
        runner.run();
        logRunner(runner);
        runner.run();
        logRunner(runner);
        runner.setState(new DeathState());
        runner.run();
        logRunner(runner);
    }

    private static void logRunner(Runner runner){
        String logMessage =String.format("%s recorrió %d kms", runner.getName(), runner.getRunKms());
        String underline = logMessage.replaceAll("\\S","=");
        System.out.println();
        System.out.println(logMessage);
        System.out.println(underline);
        System.out.println();
    }
}
