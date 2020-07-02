package com.sparta.ee;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class HeaderDTO {

    private HttpURLConnection httpURLConnection;

    public String getHeaders () throws IOException {
        URL url = new URL("https://anapioficeandfire.com/api/characters/583");
        URLConnection urlConnection = url.openConnection();
        httpURLConnection = (HttpURLConnection)url.openConnection();
        String header = httpURLConnection.getHeaderField("Connection");
        return header;
    }

}
