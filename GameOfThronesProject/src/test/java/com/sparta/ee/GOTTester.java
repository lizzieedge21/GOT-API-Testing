package com.sparta.ee;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class GOTTester {
    CharacterDTO characterDTO = new CharacterDTO();
    GOTFileReader gotFileReader = new GOTFileReader();
    HeaderDTO headers = new HeaderDTO();

    public GOTTester() throws IOException {
    }

    @Test
    void checkName() {
        Assertions.assertEquals("Jon Snow", characterDTO.fetchName());
    }

    @Test
    void checkResponseCode () throws IOException {
        Assertions.assertEquals(200, gotFileReader.getResponseCode());
    }

    @Test
    void checkServer () throws IOException {
        Assertions.assertEquals("cloudflare", headers.serverHeader());
    }

    @Test
    void checkIsString () {
        Assertions.assertEquals(true, characterDTO.isString());
    }












}
