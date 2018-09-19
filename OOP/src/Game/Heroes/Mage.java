package Game.Heroes;

import Game.Enemys.Enemy;
import Game.MortalHero;

public class Mage extends Hero implements MortalHero {

    public Mage(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println("Mage "+getName()+" cast the spell of oblivion "+getDamage()+" damage");
    }

    public boolean isAlive(){
        if (getHealth()>0)
            return true;
        else return false;
    }
}
