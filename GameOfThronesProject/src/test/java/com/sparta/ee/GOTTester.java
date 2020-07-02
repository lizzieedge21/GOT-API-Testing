package com.sparta.ee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GOTTester {
    GOTFileReader gotFileReader = new GOTFileReader();
    GOTPOJO charactersForTest = gotFileReader.readURLA("https://anapioficeandfire.com/api/characters/583");

    @Test
    void checkName () {
        Assertions.assertEquals("Jon Snow", charactersForTest.getName());
    }

    @Test
    void checkGender () {
        Assertions.assertEquals("Male", charactersForTest.getGender());
    }

    @Test
    void checkCulture () {
        Assertions.assertEquals("Northmen", charactersForTest.getCulture());
    }

    @Test
    void checkResponseCode () throws IOException {
        Assertions.assertEquals(200, gotFileReader.getURL());
    }


}
