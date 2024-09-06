package Characters.Npc.Friends;

public class Jesus {
    /*
    *
    * Jesus lhe dará vigor quando estiver cansado!
    *
    * */

    private final String name = "Jesus";
    private final Integer force = 100;

    public String getName() {
        return name;
    }

    public Integer getForce() {
        return force;
    }

    @Override
    public String toString(){
        return name + " lhe deu mais " + force + " de vigor";
    }
}
