package Game;


import Game.Enemys.Enemy;
import Game.Enemys.Oblivion;
import Game.Enemys.Zombie;
import Game.Heroes.Archer;
import Game.Heroes.Hero;
import Game.Heroes.Mage;
import Game.Heroes.Warrior;

import java.util.Random;
import java.util.Scanner;

public class BattleCore {
    final static Scanner SCAN = new Scanner(System.in);
    Random rnd = new Random();
    int heroChoice;
    int enemyChoice;
    static int choice;

    // такой же метод для  enemy
    public Hero choiceHero() {
        System.out.println("Please, choice the hero from list ");
        System.out.println("1 - Warrior.Brave and hardy  hero with a lot of health, but small damage ");
        System.out.println("2 - Mage. Nobody can mirror her spells.She have great damage and middle level of health.");
        System.out.println("3 - Archer. Smart guy with a sharp eye. His health and damage enough for distance attack.");
        choice = SCAN.nextInt();

        if (choice == 1) {
            Warrior warrior = new Warrior("Steelballs", 870, 89);
            return warrior;
        }
        if (choice == 2) {
            Mage mage = new Mage("Calisto", 450, 213);
            return mage;
        }
        if (choice == 3) {
            Archer archer = new Archer("Arrow", 600, 150);
            return archer;
        } else {
            Warrior warrior = new Warrior("Steelballs", 870, 89);
            return warrior;
        }

    }

    public  void healthInfo(Hero hero,Enemy enemy){
        System.out.println(hero.getClass().getSimpleName() +" has "+ hero.getHealth() + " health");
        System.out.println(enemy.getClass().getSimpleName() + " has " + enemy.getHealth() + " health");

    }
    public Enemy generateEnemy(){
        choice=rnd.nextInt(2);
        if (choice==0){
            Zombie zombie = new Zombie(400,115);
            return zombie;
        }
        if (choice==1){
            Oblivion oblivion = new Oblivion(800,250);
            return oblivion;
        }
        else {
            Zombie zombie = new Zombie(400,115);
            return zombie;
        }
    }
    public void fight(Hero hero,Enemy enemy){
        boolean resurrection=false;
        while (hero.getHealth()>0&&enemy.getHealth()>0){
            System.out.println(hero.getName()+" attacks. What will do");
            heroChoice=whatToDo();
            System.out.println(enemy.getClass().getSimpleName()+" attacks. What will do");
            enemyChoice=whatToDo();
            if(heroChoice==1&&enemyChoice==1){
                hero.attackEnemy(enemy);
                enemy.attackHero(hero);
                healthInfo(hero,enemy);
            }
            if (heroChoice==2&&enemyChoice==1){
                System.out.println(hero.getName()+" trying to protect himself");
                System.out.println(enemy.getClass().getSimpleName()+" try to attack");
                hero.protect();
                System.out.println(enemy.getClass().getSimpleName()+"Attack does't have success");
            }

            if(heroChoice==1&&enemyChoice==2){
                System.out.println("Hero try to attack");
                enemy.protect();
                healthInfo(hero,enemy);
            }
            if(heroChoice==2&&enemyChoice==2){
                System.out.println("Both heroes choose defense and no one get damage");
                healthInfo(hero,enemy);
            }


            if((enemy instanceof Zombie)&& !resurrection &&(!enemy.isAlive())){
                enemy.setHealth(400);
                System.out.println("Army of death immortal. Zombie resurrect and get +400 extra health");
                resurrection=true;
            }
            //enemy.getClass().getSimpleName().equals("Zombie")
        }


    }
    public  int whatToDo() {
        System.out.println("1 - Attack");
        System.out.println("2 - Protect");
        choice = SCAN.nextInt();
        return choice;
    }
}
