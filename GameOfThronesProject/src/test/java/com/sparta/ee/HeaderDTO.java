package com.sparta.ee;

import java.awt.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HeaderDTO {

        GOTFileReader gotFileReader;
        URL url = new URL("https://anapioficeandfire.com/api/characters/583");
        URLConnection urlConnection = url.openConnection();

    public HeaderDTO() throws IOException {
    }


    public int getAmountOfHeaders () {
            return gotFileReader.getHeaders().size();
        }

        public boolean emptyHeader () {
            return gotFileReader.getHeaders().isEmpty();
        }

        public boolean headerValues (String value) {
            return gotFileReader.getHeaders().containsValue(value);
        }

        public boolean headerKeys(String key) {
            return gotFileReader.getHeaders().containsKey(key);
        }

        public String serverHeader () throws IOException {
            return urlConnection.getHeaderField("Server");
        }

        public String connectionHeader () throws IOException {
            return urlConnection.getHeaderField("Connection");
        }

        public String transferHeader () {
            return urlConnection.getHeaderField("Transfer-Encoding");
        }











    }

