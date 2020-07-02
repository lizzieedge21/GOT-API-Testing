package com.sparta.ee;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class CharacterDTO {
    private GOTPOJO gotpojo;

public void characterDTO (String jacksonLocation) {
    GOTFileReader gotFileReader = new GOTFileReader();
    gotpojo = gotFileReader.readURLA(jacksonLocation);

}

//public int fetchNumberOfValues () {
//    return gotpojo.
//}

public List<String> fetchAliases () {
    return gotpojo.getAliases();
}

public List<String> fetchAllegiances () {
    return gotpojo.getAllegiances();
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
