package Misc;

import java.util.Random;

public class D6 {
    private Random random;

    public D6() {
        this.random = new Random();
    }

    public Integer getD6(){
        return random.nextInt(6)+1;
    }


}
