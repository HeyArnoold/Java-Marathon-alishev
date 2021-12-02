package day11.task2;

import day11.task2.Interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack{

    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double magicalAttack = magicAtt - (magicAtt * hero.magicDef);
        if (hero.health - magicalAttack <= 0) {
            hero.health = 0;
        } else {
            hero.health -= magicalAttack;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
