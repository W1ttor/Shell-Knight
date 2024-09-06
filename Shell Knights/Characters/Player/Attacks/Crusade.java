package Characters.Player.Attacks;

public class Crusade implements Attacks{
    private Integer Crusade;

    @Override
    public Integer damage(String category) {
        if (category.equals("demon")){
            return Crusade = 40;
        } else if (category.equals("human")){
            return Crusade = 60;
        } else {
            return 0;
        }
    }
}
