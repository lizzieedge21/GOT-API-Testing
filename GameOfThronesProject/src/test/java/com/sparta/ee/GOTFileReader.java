package com.sparta.ee;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class GOTFileReader {
    ObjectMapper objectMapper = new ObjectMapper();

    public GOTPOJO readURLA (String path) {
        GOTPOJO gotpojo = new GOTPOJO();

        try {
            gotpojo = objectMapper.readValue(new URL(path), GOTPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gotpojo;
    }

    public int getURL () throws IOException {
        URL url = new URL("https://anapioficeandfire.com/api/characters/583");
        URLConnection urlConnection = url.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        int responseCode = httpURLConnection.getResponseCode();
        return responseCode;

    }



}
