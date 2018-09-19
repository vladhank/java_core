package Game;

import Game.Enemys.Enemy;
import Game.Heroes.Hero;

public interface MortalEnemy {
    boolean isAlive();
    void attackHero(Hero hero);

}
