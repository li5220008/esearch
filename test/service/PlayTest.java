package service;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import play.Play;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 13-12-9
 * Time: 上午9:38
 */
public class PlayTest {
    @Test
    public void playTest() throws Exception{
        //System.setProperty("application.path", "d/www");
        //System.out.println(System.getProperty("application.path"));
        //String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        //System.out.println(ManagementFactory.getRuntimeMXBean().getName());
        //System.out.println(System.getProperty("play.id", "kk"));

        /*PropertyConfigurator.configure("D:/www/esearch/conf/log4j.properties");
        Logger logger  =  Logger.getLogger(PlayTest.class );
        logger.debug("debug");
        logger.error("error");*/

        /*Properties properties = System.getProperties();
        Enumeration<?> enumeration = properties.keys();
        String property = "";
        while (enumeration.hasMoreElements()) {
            property = (String) enumeration.nextElement();
            System.out.println("//value: " + System.getProperty(property));
            System.out.println(property);
        }*/

        /*StringEntity myEntity = new StringEntity("important mess中国age",
                ContentType.create("text/plain", "UTF-8"));

        System.out.println(myEntity.getContentType());
        System.out.println(myEntity.getContentLength());
        System.out.println(EntityUtils.toString(myEntity,"GBK"));
        System.out.println(EntityUtils.toByteArray(myEntity).length);*/

        /*Pattern p = Pattern.compile(".*--http.port=(\\d+)");
        Matcher m = p.matcher("sss--http.port=9000");
        if(m.find()){
            System.out.println(m.group(1));
        }

        jregex.Matcher jm  = new jregex.Pattern(".*--http.port=({port}\\d+)").matcher("sss--http.port=9000");
        while (jm.find()){
            System.out.println(jm.group("port"));
        }*/

        System.out.println(System.getenv("MODULE"));

        File localModules = Play.getFile("modules");
        System.out.println(localModules);



    }
}
