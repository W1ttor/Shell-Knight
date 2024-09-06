package Characters.Npc.Friends;

import Characters.Npc.Friends.HealingNPC.HealingNPC;
import Items.Healing.Healing;

public class Jesus implements HealingNPC, Healing {
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

    @Override
    public Integer healing() {
        return getForce();
    }
}
