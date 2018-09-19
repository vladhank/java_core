package Game;

import Game.Enemys.Enemy;
import Game.Enemys.Zombie;
import Game.Heroes.Archer;
import Game.Heroes.Hero;
import Game.Heroes.Mage;
import Game.Heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Hero hero = new BattleCore().choiceHero();
        Enemy enemy = new BattleCore().generateEnemy();
        BattleCore battle = new BattleCore();
        battle.fight(hero,enemy);
    }
}
