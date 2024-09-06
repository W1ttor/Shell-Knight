package Characters.Npc.Friends;


import Characters.Npc.Friends.HealingNPC.HealingNPC;

public abstract class Disciples {
    private String name;
    private Integer health;
    private Integer damage;
    private Integer dado;

    public Disciples(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDado(Integer dado) {
        this.dado = dado;
    }

    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getDamage() {
        return damage;
    }

    public Integer damage(){
        switch (dado){
            case 1:
                return damage = 30;
            case 2:
                return damage = 35;
            case 3:
                return damage = 40;
            case 4:
                return damage = 45;
            case 5:
                return damage = 50;
            default:
                return damage = 10;
        }
    }

    public void addHealth(HealingNPC healingNPC){
        if (health == 100){
            health = 100;
        } else if (health + healingNPC.healing() == 100) {
            health = 100;
        } else {
            health += healingNPC.healing();
        }
    }

    public void damage(Integer damage){
        health -= damage;
    }
}
