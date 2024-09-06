package Characters.Player.Attacks;

public class AbsoluteTruth implements Attacks{
    private Integer AbsoluteTruth;

    @Override
    public Integer damage(String category) {
        if (category.equals("demon")){
            return AbsoluteTruth = 50;
        } else if (category.equals("human")){
            return AbsoluteTruth = 50;
        } else {
            return 0;
        }
    }
}
