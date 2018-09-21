package com.ramimartin.decorator.model;

import static java.lang.Math.*;

public final class BaseUnit implements Unit {


    private String name;
    private Integer attackPoints;
    private Integer defensePoints;
    private Integer maxMovePoints;
    private Integer positionX;
    private Integer positionY;

    public BaseUnit(String name, Integer positionX, Integer positionY) {
        System.out.println(String.format("%s was born", name));
        this.name = name;
        this.attackPoints = 0;
        this.defensePoints = 0;
        this.maxMovePoints = 1;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAttackPoints(){
        return this.attackPoints;
    }

    @Override
    public Integer getDefensePoints(){
        return this.defensePoints;
    }

    @Override
    public Integer getMaxMovePoints() {
        return maxMovePoints;
    }

    @Override
    public void move(Integer x, Integer y){
        if (abs(x) + abs(y) > this.getMaxMovePoints()){
            throw new RuntimeException("can't move!!!");
        }
        this.positionX = positionX + x;
        this.positionY = positionY + y;
    }

}
