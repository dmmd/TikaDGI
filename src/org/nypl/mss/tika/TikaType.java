package org.nypl.mss.tika;

import java.io.File;
import java.io.IOException;
import org.apache.tika.Tika;

public class TikaType {
    private final String type;

    public TikaType(File f) throws IOException {
        Tika tika = new Tika();
        type = tika.detect(f);
    }
    
    public String getType(){
        return type;
    }
}
