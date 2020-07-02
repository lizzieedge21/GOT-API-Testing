package com.sparta.ee;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class CharacterDTO {
    private GOTPOJO gotpojo;

    public CharacterDTO (String jacksonLocation) {
        GOTFileReader gotFileReader = new GOTFileReader();
        gotpojo = gotFileReader.readURLA(jacksonLocation);
    }


public String fetchName () {
    return gotpojo.getName();
}

public String fetchGender () {
    return gotpojo.getGender();
}

public String fetchCulture () {
    return gotpojo.getCulture();
}


}
