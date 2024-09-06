package Items.Healing;

public class BandAid implements Healing {
    private final Integer bandAid = 25;

    @Override
    public Integer healing() {
        return bandAid;
    }
}
