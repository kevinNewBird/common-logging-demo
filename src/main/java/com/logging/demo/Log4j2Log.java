package com.logging.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * description  Log4j2Log <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:31  2023/2/10
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Log4j2Log {
   static Logger logger = LogManager.getLogger(Log4j2Log.class);

    /**
     * 需要引入的pom依赖：
     *     <dependency>
     *       <groupId>org.apache.logging.log4j</groupId>
     *       <artifactId>log4j-api</artifactId>
     *     </dependency>
     *     <dependency>
     *       <groupId>org.apache.logging.log4j</groupId>
     *       <artifactId>log4j-core</artifactId>
     *     </dependency>
     * 且需配置log4j2.xml文件
     * @param args
     */
    public static void main(String[] args) {
        logger.info("This is info Message!!!");
        logger.debug("This is debug Message!!!");
        logger.warn("This is warn Message!!!");
        logger.error("This is error Message!!!");
    }
}
