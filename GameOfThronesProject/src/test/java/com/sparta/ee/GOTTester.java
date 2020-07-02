package com.sparta.ee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GOTTester {
    CharacterDTO characterDTO = new CharacterDTO();
    GOTFileReader gotFileReader = new GOTFileReader();
    HeaderDTO headers = new HeaderDTO();
    //GOTPOJO charactersForTest = gotFileReader.readURLA("https://anapioficeandfire.com/api/characters/583");

    @Test
    void checkName () {
        Assertions.assertEquals("Jon Snow", characterDTO.fetchName());
    }

    @Test
    void checkGender () {
        Assertions.assertEquals("Male", characterDTO.fetchGender());
    }

    @Test
    void checkCulture () {
        Assertions.assertEquals("Northmen", characterDTO.fetchCulture());
    }

    @Test
    void checkResponseCode () throws IOException {
        Assertions.assertEquals(200, gotFileReader.getURL());
    }

    @Test
    void checkHeaders () throws IOException {
        Assertions.assertEquals("keep-alive", headers.getHeaders());
    }


}
