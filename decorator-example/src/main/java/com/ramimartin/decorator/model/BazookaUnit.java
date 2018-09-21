package com.ramimartin.decorator.model;

public final class BazookaUnit implements Unit {

    private Unit decoratedUnit;

    public BazookaUnit(Unit decoratedUnit) {
        this.decoratedUnit = decoratedUnit;
        System.out.println(String.format("%s was updated to bazooka", this.getName()));
    }

    @Override
    public String getName() {
        return decoratedUnit.getName();
    }

    @Override
    public Integer getAttackPoints() {
        return decoratedUnit.getAttackPoints() + 99;
    }

    @Override
    public Integer getDefensePoints() {
        return decoratedUnit.getDefensePoints();
    }

    @Override
    public Integer getMaxMovePoints() {
        return decoratedUnit.getMaxMovePoints();
    }

    @Override
    public void move(Integer x, Integer y) {
        decoratedUnit.move(x, y);
    }
}
