package tech.robNelson.lambda;

import java.io.Serializable;
import java.util.List;

public class FauxPhoneResponse implements Serializable {
    private List<String> phoneNumbers;

    public  List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
