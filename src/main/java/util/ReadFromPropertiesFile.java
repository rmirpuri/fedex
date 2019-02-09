package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by rajiv on 2019-02-09.
 */
public class ReadFromPropertiesFile {

    InputStream inputStream;
    String value = "";


    public String getPropVaues(String fileName, String key) throws IOException{

        try{
            Properties prop = new Properties();

            inputStream = getClass().getClassLoader().getResourceAsStream(fileName);

            if(inputStream!=null){
                prop.load(inputStream);
            }else{
                throw new FileNotFoundException("Property file: "+ fileName+ " not found in classPath.");
            }

            value = prop.getProperty(key);

        }catch (Exception e){
            System.out.println("Exception: " + e);
        }finally {
            inputStream.close();
        }


        return value;

    }


}
