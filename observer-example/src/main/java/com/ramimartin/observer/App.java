package com.ramimartin.observer;


import com.ramimartin.observer.model.Match;
import com.ramimartin.observer.observers.JournalistObserver;
import com.ramimartin.observer.observers.MatchObserver;
import com.ramimartin.observer.observers.ScoreObserver;

public class App {

    public static void main(String[] args) {
        Match match = new Match("Independiente", "Racing");
        ScoreObserver scoreObserver = new ScoreObserver();
        MatchObserver silentObserver = new MatchObserver() {
            @Override
            public void notifyGoal(String team, String author) {
                System.out.println("...");
            }

            @Override
            public void notifyStart(String team1, String team2) {
                System.out.println("...");
            }
        };
        match.addObserver(scoreObserver);
        match.addObserver(new JournalistObserver());
        match.addObserver(silentObserver);
        match.start();
        match.team1DoGoal("Burruchaga");
        match.team1DoGoal("Bertoni");
        match.team1DoGoal("Bochini");
        System.out.println("SilentObserver go away");
        match.removeObserver(silentObserver);
        match.team2DoGoal("Paz");

        System.out.print(scoreObserver.getScore());
    }
}
