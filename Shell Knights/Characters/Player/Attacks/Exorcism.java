package Characters.Player.Attacks;

import Enum.EnemyClass;

public class Exorcism implements Attacks{
    private Integer exorcism;

    @Override
    public Integer damage(String category) {
        if (category.equals("demon")){
            return exorcism = 80;
        } else if (category.equals("human")){
            return exorcism = 30;
        } else {
            return 0;
        }
    }
}
