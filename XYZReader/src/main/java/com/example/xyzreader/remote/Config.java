package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json");
        } catch (MalformedURLException ignored) {
            throw new UnsupportedOperationException("Error occurred");
        }
        BASE_URL = url;
    }
}
