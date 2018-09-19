package Game.Heroes;

import Game.Enemys.Enemy;
import Game.MortalHero;

public class Archer extends Hero implements MortalHero {

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println("Archer "+getName()+" aptly shot an arrow "+getDamage()+" damage");
    }

    public boolean isAlive(){
        if (getHealth()>0)
            return true;
        else return false;
    }
}
