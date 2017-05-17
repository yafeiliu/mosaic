package com.mosaic.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 刘亚飞 on 2017/5/17.
 */
public class LoggingMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingMain.class);

    public static void main(String[] args) {
        LOGGER.debug("DEBUG");
        LOGGER.info("INFO");
        LOGGER.warn("WARN");
        LOGGER.error("ERROR");
    }

}
