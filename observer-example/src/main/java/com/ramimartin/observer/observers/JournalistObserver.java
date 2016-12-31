package com.ramimartin.observer.observers;


public class JournalistObserver implements MatchObserver {
    @Override
    public void notifyGoal(String team, String author) {
        System.out.println(String.format("Gooooooooooooal. %s makes it", author));

    }

    @Override
    public void notifyStart(String team1, String team2) {
        System.out.println(String.format("The match between %s and %s has started", team1, team2));
    }
}
