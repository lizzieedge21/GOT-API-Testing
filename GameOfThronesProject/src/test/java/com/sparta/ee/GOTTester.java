package com.sparta.ee;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class GOTTester {
    CharacterDTO characterDTO = new CharacterDTO("https://anapioficeandfire.com/api/characters/583");
    GOTFileReader gotFileReader = new GOTFileReader();
    HeaderDTO headers = new HeaderDTO();

    public GOTTester() throws IOException {
    }

    @Test
    void checkName() {
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
        Assertions.assertEquals(200, gotFileReader.getResponseCode());
    }

    @Test
    void checkEmptyHeader () {
        Assertions.assertEquals(false, headers.emptyHeader());
    }

    @Test
    void checkSizeOfHeaders () {
        Assertions.assertEquals(14, headers.getAmountOfHeaders());
    }

    @Test
    void checkServer () throws IOException {
        Assertions.assertEquals("cloudflare", headers.serverHeader());
    }

    @Test
    void checkConnection () throws IOException {
        Assertions.assertEquals("keep-alive", headers.connectionHeader());
    }

    @Test
    void checkTransfer () {
        Assertions.assertEquals("chunked", headers.transferHeader());
    }

    @Test
    void checkIsString () {
        Assertions.assertEquals(true, characterDTO.isString());
    }

    @Test
    void checkValues () {
        Assertions.assertEquals(true, headers.headerKeys("Vary"));
    }










}
