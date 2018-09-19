package Game.Enemys;

import Game.Heroes.Hero;

public class Zombie extends Enemy {

    @Override
    public boolean isAlive(){
        if (getHealth()>0)
            return true;
        else return false;
    }

    public Zombie(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(getDamage());
        System.out.println("Zombie devouring enemy flesh and deals him " + getDamage()+" damage");
    }


}
