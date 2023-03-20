package utils;

import lombok.experimental.UtilityClass;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@UtilityClass                         //указывает что все методы статические
public class RetrofitUtils {

    Properties properties = new Properties();
    private final InputStream configFile;

    static {
        try {
            configFile = new FileInputStream("src/main/resources/application.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getBaseUrl() {
        try {
            properties.load(configFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty("url");
    }


    public Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(getBaseUrl())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
}