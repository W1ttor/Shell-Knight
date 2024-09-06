package Enum;

public enum EnemyClass {
    DEMON("demon"),
    HUMAN("human");

    private String code;

    EnemyClass(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
