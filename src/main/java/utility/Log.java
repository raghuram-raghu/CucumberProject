package utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    public static final Logger logger = LogManager.getLogger(Log.class);


    public static void info(String Message){

        logger.info(Message);
    }

    public static void error(String Message){

        logger.error(Message);
    }

    public static void warn(String Message){

        logger.warn(Message);
    }

    public static void debug(String Message){

        logger.debug(Message);

    }

}
