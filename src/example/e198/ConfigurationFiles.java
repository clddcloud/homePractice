package example.e198;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationFiles {
    public static void main(String[] args) throws IOException, InterruptedException {
        String path="src/example/e198/config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fis);
        System.out.println("Browser: "+properties.getProperty("Browser")+" URL: "+properties.getProperty("URL")+" Implicit Wait: "+properties.getProperty("ImplicitWait")+" seconds");
        // need Maven Project and added dependencies to run this part:
         /*
            if (properties.getProperty("Browser").equals("chrome")){
            ChromeDriver c = new ChromeDriver();
            c.get(properties.getProperty("URL"));
            Thread.sleep(Long.parseLong(properties.getProperty("ImplicitWait"))*1000);
            c.quit();
        }
        */
}
}
