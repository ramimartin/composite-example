package com.ramimartin.decorator.model;

public class HorseRiderUnit implements Unit {

    private Unit decoratedUnit;

    public HorseRiderUnit(Unit decoratedUnit) {
        this.decoratedUnit = decoratedUnit;
        System.out.println(String.format("%s was updated to horse rider", this.getName()));
    }

    @Override
    public String getName() {
        return decoratedUnit.getName();
    }

    @Override
    public Integer getAttackPoints() {
        return decoratedUnit.getAttackPoints();
    }

    @Override
    public Integer getDefensePoints() {
        return decoratedUnit.getDefensePoints();
    }

    @Override
    public Integer getMaxMovePoints() {
        return decoratedUnit.getMaxMovePoints() + 5;
    }

    @Override
    public void move(Integer x, Integer y) {
        decoratedUnit.move(x,y);
    }

}
