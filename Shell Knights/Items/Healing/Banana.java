package Items.Healing;

public class Banana implements Healing{
    private final Integer banana = 15;

    @Override
    public Integer healing() {
        return banana;
    }
}
