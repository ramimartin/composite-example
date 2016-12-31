package com.ramimartin.observer.model;

import com.ramimartin.observer.observers.MatchObserver;
import com.ramimartin.observer.observers.ScoreObserver;

import java.util.ArrayList;
import java.util.Collection;


public class Match {

    private String team1;
    private String team2;
    private Collection<MatchObserver> observers;
    private boolean started;


    public Match(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.started = false;
        this.observers = new ArrayList<>();
    }

    public void start() {
        this.started = true;
        notifyStart();
    }

    public void team1DoGoal(String author) {
        if (!started)
            throw new RuntimeException();
        notifyGoal(team1, author);
    }

    private void notifyGoal(String team, String author) {
        observers.forEach(observer -> observer.notifyGoal(team, author));
    }

    private void notifyStart() {
        observers.forEach(observer -> observer.notifyStart(team1, team2));
    }

    public void team2DoGoal(String author) {
        if (!started)
            throw new RuntimeException();
        notifyGoal(team2, author);
    }

    public void addObserver(MatchObserver matchObserver) {
        this.observers.add(matchObserver);
    }

    public void removeObserver(MatchObserver matchObserver) {
        this.observers.remove(matchObserver);
    }
}
