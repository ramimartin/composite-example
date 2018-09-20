package com.ramimartin.decorator.model;

public interface Unit {
    String getName();

    Integer getAttackPoints();

    Integer getDefensePoints();

    Integer getMaxMovePoints();

    void move(Integer x, Integer y);

    default void attack(Unit aUnit) {
        System.out.println(String.format("%s attacks %s", this.getName(), aUnit.getName()));
        if (this.getAttackPoints() > aUnit.getDefensePoints())
            System.out.println(String.format("%s defeated %s", this.getName(), aUnit.getName()));
        else
            System.out.println(String.format("%s was defeated by %s", this.getName(), aUnit.getName()));    }
}
