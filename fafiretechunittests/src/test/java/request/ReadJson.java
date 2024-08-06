package request;

import java.io.InputStream;

public class ReadJson {

    public InputStream readJson(String path) {

        InputStream jsonResource = getClass().getClassLoader().getResourceAsStream(path);

        return jsonResource;
    }
}

