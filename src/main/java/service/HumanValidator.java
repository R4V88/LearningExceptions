package service;

import exception.HumanLastnameWrongFormat;
import exception.HumanNameWrongFormat;

public class HumanValidator {

    public static String isNameLongerThan3(String name) throws HumanNameWrongFormat {
        String validName;
        if (name.length() > 3) {
            validName = name;
            return validName;
        }
        throw new HumanNameWrongFormat(name + " is too short!");
    }

    public static String isLastnameLongerThan5(String lastname) throws HumanLastnameWrongFormat {
        String validName;
        if (lastname.length() > 5) {
            validName = lastname;
            return validName;
        }
        throw new HumanLastnameWrongFormat(lastname + " is too short!");
    }
}
