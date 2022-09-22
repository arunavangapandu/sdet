package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FrameworkProperties {

    public String getProperty(String key){
        String fileName = Constants.PROP_FILE_NAME;
        String result = null;
        try{

            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);


            Properties props = new Properties();

            if(inputStream != null) {

                props.load(inputStream);

            }
            else {
                throw new FileNotFoundException(Constants.FILE_NOT_FOUND_EXCEPTION_MESSAGE);
            }
            result = props.getProperty(key);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }


}
