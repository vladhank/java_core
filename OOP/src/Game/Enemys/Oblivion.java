package Game.Enemys;

import Game.Heroes.Hero;

public class Oblivion extends Enemy {

    public Oblivion(int health, int damage) {
        super(health, damage);

    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(getDamage());
        System.out.println("Oblivion " + " bite " + hero.getName() + " and deals " + getDamage() + " damage to him");

    }

    @Override
    public boolean isAlive() {
        if (getHealth() > 0)
            return true;
        else return false;
    }
}
