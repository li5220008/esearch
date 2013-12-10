package service;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

/**
 * desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 13-12-9
 * Time: 上午9:38
 */
public class PlayTest {
    @Test
    public void playTest(){
        //System.setProperty("application.path", "d/www");
        //System.out.println(System.getProperty("application.path"));
        //String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        //System.out.println(ManagementFactory.getRuntimeMXBean().getName());
        //System.out.println(System.getProperty("play.id", "kk"));

        PropertyConfigurator.configure("D:/www/esearch/conf/log4j.properties");
        Logger logger  =  Logger.getLogger(PlayTest.class );
        logger.debug("debug");
        logger.error("error");

    }
}
