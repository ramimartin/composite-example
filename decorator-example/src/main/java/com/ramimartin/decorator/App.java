package com.ramimartin.decorator;

import com.ramimartin.decorator.model.BaseUnit;
import com.ramimartin.decorator.model.BazookaUnit;
import com.ramimartin.decorator.model.InvincibleUnit;
import com.ramimartin.decorator.model.Unit;

public class App {

    public static void main(String[] args){

        Unit baseUnit = new BaseUnit("Farmer",0,0);
        Unit bazookaMan = new BazookaUnit(new BaseUnit("BazookaMan", 0,0));
        bazookaMan.attack(baseUnit);
        bazookaMan.attack(new InvincibleUnit(baseUnit));

    }
}
