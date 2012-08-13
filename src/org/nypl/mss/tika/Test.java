package org.nypl.mss.tika;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.Tika;

public class Test {
    private String fileIn;
    private final Tika tika;
    private List<File> files;
    
    Test(String fileIn) throws IOException{
        tika = new Tika();
        this.fileIn = fileIn;
        doColl();
        testFiles();
        
    }
    
    public static void main(String[] args) throws IOException{
        String s = "files";
        Test test = new Test(s);
    }

    private void doColl() { 
        files = new ArrayList<File>(Arrays.asList(new File(fileIn).listFiles()));
    }

    private void testFiles() throws IOException {
        for(File file: files){
            System.out.println(file.getName());
            System.out.println("tikaId: " + tika.detect(file));
            System.out.println();
        }
    }
}
