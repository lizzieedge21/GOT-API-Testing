package com.sparta.ee;

import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;
import java.util.List;

public class CharacterDTO {
    private GOTPOJO gotpojo;

    public CharacterDTO () throws MalformedURLException {
        GOTFileReader gotFileReader = new GOTFileReader();
        gotpojo = gotFileReader.readURLA("https://anapioficeandfire.com/api/characters/583");
    }


    public boolean isString () {
        return gotpojo.getName().matches("Jon Snow");
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

public String fetchDied () {
        return gotpojo.getDied();
}

public String fetchBorn () {
        return gotpojo.getBorn();
}

public List<String> fetchBooks () {
        return gotpojo.getBooks();
}

public List<String> fetchTitles () {
        return gotpojo.getTitles();
}

public List<String> fetchTV () {
        return gotpojo.getTvSeries();
}

public String fetchFather () {
        return gotpojo.getFather();
}

public String fetchMother () {
        return gotpojo.getMother();
}





}



