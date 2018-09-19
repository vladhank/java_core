package Game.Heroes;

import Game.Enemys.Enemy;
import Game.MortalEnemy;
import Game.MortalHero;

public abstract class Hero {
    private String name;
    private int health;
    private int damage;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public int takeDamage(int damage){
        health-=damage;
        return health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void protect(){
        System.out.println(getName()+ " protected from attack and get no damage");
        System.out.println(getName()+ " has "+getHealth());

    }
}
