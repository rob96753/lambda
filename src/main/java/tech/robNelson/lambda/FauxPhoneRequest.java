package tech.robNelson.lambda;

import java.io.Serializable;

public class FauxPhoneRequest implements Serializable {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}