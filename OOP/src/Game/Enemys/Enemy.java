package Game.Enemys;

import Game.Heroes.Hero;
import Game.MortalEnemy;

public abstract class Enemy implements MortalEnemy {
    private int health;
    private int damage;
    private boolean alive;

    public int getDamage() {
        return damage;
    }

    public abstract boolean isAlive();

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage){
        health-=damage;
        return health;
    }
    public abstract void attackHero(Hero hero);

    public void protect(){
        System.out.println(getClass().getSimpleName()+ " protected from attack and get no damage");
        System.out.println(getClass().getSimpleName()+ " has "+getHealth());

    }
}
