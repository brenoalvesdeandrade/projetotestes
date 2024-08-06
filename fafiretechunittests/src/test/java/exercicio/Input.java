package exercicio;

import java.io.InputStream;

public class Input {

    public InputStream teste(String path){

        InputStream json = getClass().getClassLoader().getResourceAsStream(path);
        return json;
    }
}
