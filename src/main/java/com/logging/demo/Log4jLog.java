package com.logging.demo;


import org.apache.log4j.Logger;

/**
 * description  Log4jLog <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:08  2023/2/10
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Log4jLog {

    private static Logger log = Logger.getLogger(Log4jLog.class);

    /**
     * 需要引入pom依赖：
     *     <dependency>
     *             <groupId>log4j</groupId>
     *             <artifactId>log4j</artifactId>
     *             <version>1.2.17</version>
     *     </dependency>
     * 且需配置log4j.properties文件
     * @param args
     */
    public static void main(String[] args) {
        log.debug("This is debug message!");
        log.info("This is info message!");
        log.error("This is error message!");

    }
}
