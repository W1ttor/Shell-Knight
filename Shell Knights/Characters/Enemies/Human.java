package Characters.Enemies;


public class Human {
    private final String name = "Humano";
    private Integer health;
    private Integer damage ;
    private Integer dado;

    public void setDado(Integer dado) {
        this.dado = dado;
    }

    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer damage(){
        switch (dado){
            case 1:
                return damage = 20;
            case 2:
                return damage = 25;
            case 3:
                return damage = 30;
            case 4:
                return damage = 35;
            case 5:
                return damage = 40;
            default:
                return damage = 5;
        }
    }
}
