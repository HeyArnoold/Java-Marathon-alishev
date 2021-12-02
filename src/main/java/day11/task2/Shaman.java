package day11.task2;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;

public class Shaman extends Hero implements MagicAttack, Healer {

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + 50 > 100) {
            health = 100;
        }else {
            health += 50;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 > 100) {
            hero.health = 100;
        }else {
            hero.health += 30;
        }
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
