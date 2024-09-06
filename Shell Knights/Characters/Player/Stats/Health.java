package Characters.Player.Stats;

import Items.Healing.Healing;

public class Health {
    private Integer health;

    public Health(Integer health) {
        this.health = health;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void addHealth(Healing amount){
        if (health == 100){
           health = 100;
        } else if (health + amount.healing() >= 100) {
            health = 100;
        } else {
            health += amount.healing();
        }
    }

    public void damage(Integer damage){
        health -= damage;
    }
}
