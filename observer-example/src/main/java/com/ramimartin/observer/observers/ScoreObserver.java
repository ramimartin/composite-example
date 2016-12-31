package com.ramimartin.observer.observers;


import java.util.HashMap;
import java.util.Map;

public class ScoreObserver implements MatchObserver {

    private Map<String, Integer> goalsByTeam;

    public ScoreObserver() {
        this.goalsByTeam = new HashMap<>();
    }


    @Override
    public void notifyGoal(String team, String author) {
        Integer goalsByThatTeam = goalsByTeam.get(team);
        if (goalsByThatTeam == null)
            goalsByThatTeam = 0;
        goalsByThatTeam++;
        goalsByTeam.put(team, goalsByThatTeam);
    }

    @Override
    public void notifyStart(String team1, String team2) {
        goalsByTeam.put(team1, 0);
        goalsByTeam.put(team2, 0);
    }

    public String getScore() {
        StringBuilder builder = new StringBuilder("Match:\n");
        for (Map.Entry<String, Integer> entry : goalsByTeam.entrySet()) {
            builder.append(entry.getKey()).append(" --> ");
            builder.append(entry.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
