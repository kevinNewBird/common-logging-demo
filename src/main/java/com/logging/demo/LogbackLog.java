package com.logging.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * description  LogbackLog <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:08  2023/2/10
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class LogbackLog {

    private static Logger logger = LoggerFactory.getLogger(LogbackLog.class);

    /**
     * 需要引入的pom依赖：
     *     <dependency>
     *         <groupId>ch.qos.logback</groupId>
     *         <artifactId>logback-classic</artifactId>
     *         <version>1.2.11</version>
     *     </dependency>
     *     logback-classic依赖引入，自动引入以下jar:
     *         logback-classic.x.x.x.jar
     *         logback-core.x.x.x.jar
     *         slf4j-api-x.x.x.jar
     *  且需配置文件logback.xml
     *  <!-- level表示日志级别：OFF、FATAL、ERROR、WARN、INFO、DEBUG、TRACE、 ALL ，默认是DEBUG-->
     * @param args
     */
    public static void main(String[] args) {
        logger.info("This is logback info message!!!!!");
        logger.debug("This is logback debug message!!!!!");
        logger.error("This is logback error message!!!!!");
    }
}
