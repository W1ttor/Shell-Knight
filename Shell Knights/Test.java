import Characters.Npc.Friends.Disciples;
import Characters.Npc.Friends.HealingNPC.HealingNPC;
import Characters.Npc.Friends.HealingNPC.Kiwi;
import Characters.Npc.Friends.LordAurelius;
import Characters.Player.Stats.Health;
import Items.Healing.Banana;


public class Test {
    public static void main(String[] args){

       Disciples lordAurelius = new LordAurelius( 100);

        lordAurelius.damage(20);

        lordAurelius.addHealth(new Kiwi());

        System.out.println(lordAurelius.getHealth());
        System.out.println(lordAurelius.getName());
    }
}
