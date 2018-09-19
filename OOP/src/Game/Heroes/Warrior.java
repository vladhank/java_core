package Game.Heroes;

import Game.Enemys.Enemy;
import Game.MortalHero;

public class Warrior extends Hero implements MortalHero {


    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        //узнать почему в takeDamage Game.Enemys.Enemy
        enemy.takeDamage(getDamage());
        System.out.println("Warrior " + getName() + " swung his sword and deals " + +getDamage() + " damage for enemy");

    }


    public boolean isAlive() {
        if (getHealth() > 0)
            return true;
        else return false;
    }


}
