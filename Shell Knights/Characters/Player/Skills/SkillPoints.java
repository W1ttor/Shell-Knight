package Characters.Player.Skills;

public class SkillPoints {
    private Integer skillPoints;

    public SkillPoints(Integer skillPoints) {
        this.skillPoints = skillPoints;
    }

    public Integer getSkillPoints() {
        return skillPoints;
    }

    public void addSkillPoints(Integer point) {
        skillPoints += point;
    }
}
