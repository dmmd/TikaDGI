/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nypl.mss.tika;

import java.io.*;
import org.apache.tika.language.LanguageProfile;
import org.apache.tika.language.ProfilingWriter;

public class TikaLanguage {
    private final File file;
    private String language;
    
    TikaLanguage(File f) throws FileNotFoundException, IOException{
        file = f;
        parse();
    }
    
    private void parse() throws FileNotFoundException, IOException{
       ProfilingWriter pw = new ProfilingWriter();
       BufferedReader reader = new BufferedReader(new FileReader(file));
       String line;
       
       while((line = reader.readLine()) != null){
           pw.append(line);
       }
       language = pw.getLanguage().getLanguage(); 
    }
    
    public String getLanguage(){
        return language;
    }
}
