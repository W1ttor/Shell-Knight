package Characters.Player.Stats;

public class Health {
    private Integer health;

    public Health() {
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer addHealth(Integer amount){
        if (health == 100){
           return health = 100;
        } else if (health + amount >= 100) {
            return health = 100;
        } else {
            return health += amount;
        }
    }

    public void damage(Integer damage){
        health -= damage;
    }
}
