package com.xiaotao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Hello {
    public static Logger logger = LoggerFactory.getLogger(Hello.class);

    public static void main(String args[]) {
        System.out.println("hello!");
        tryLog();
    }

    public static void tryLog() {
        logger.debug("This is a {} line: {}", "debug", "hello");
        logger.info("This is a {} line: {}", "info", "hello");
        logger.warn("This is a {} line: {}", "warn", "hello");
        logger.error("This is a {} line: {}", "error", "hello");
    }
}
