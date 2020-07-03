package com.sparta.ee;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class GOTFileReader {
    ObjectMapper objectMapper = new ObjectMapper();
    private HttpURLConnection httpURLConnection;
    URL url = new URL("https://anapioficeandfire.com/api/characters/583");

    public GOTFileReader() throws MalformedURLException {
    }

    public GOTPOJO readURLA (String path) {
        GOTPOJO gotpojo = new GOTPOJO();

        try {
            gotpojo = objectMapper.readValue(new URL(path), GOTPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gotpojo;
    }

    public int getResponseCode() throws IOException {
        URLConnection urlConnection = url.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        int responseCode = httpURLConnection.getResponseCode();
        return responseCode;

    }

    public Map getHeaders () {
        try {
            url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            httpURLConnection = (HttpURLConnection)url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpURLConnection.getHeaderFields();
    }


}
