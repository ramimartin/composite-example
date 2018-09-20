package com.ramimartin.decorator.model;

public class InvincibleUnit implements Unit {

    private Unit decoratedUnit;

    public InvincibleUnit(Unit decoratedUnit) {
        this.decoratedUnit = decoratedUnit;
        System.out.println(String.format("%s was updated to invincible!", this.getName()));
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
        return decoratedUnit.getDefensePoints() + 999;
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
