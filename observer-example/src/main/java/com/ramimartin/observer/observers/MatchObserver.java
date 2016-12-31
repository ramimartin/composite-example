package com.ramimartin.observer.observers;


public interface MatchObserver {

    void notifyGoal(String team, String author);

    void notifyStart(String team1, String team2);
}
