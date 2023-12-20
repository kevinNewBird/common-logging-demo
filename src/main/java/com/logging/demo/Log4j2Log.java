package com.logging.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

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

   static org.slf4j.Logger logger2 = LoggerFactory.getLogger(Log4j2Log.class);

    /**
     * 需要引入的pom依赖（推荐版本2.17.2）：
     *     <dependency>
     *       <groupId>org.apache.logging.log4j</groupId>
     *       <artifactId>log4j-api</artifactId>
     *     </dependency>
     *     <dependency>
     *       <groupId>org.apache.logging.log4j</groupId>
     *       <artifactId>log4j-core</artifactId>
     *     </dependency>
     * 且需配置log4j2.xml文件，实例对象logger
     *
     * 如果需要在工程中使用org.slf4j（推荐），增加如下配置(即实例对象logger2)：
     *    <dependency>
     *        <groupId>org.apache.logging.log4j</groupId>
     *        <artifactId>log4j-slf4j-impl</artifactId>
     *        <version>2.17.2</version>
     *   </dependency>
     * @param args
     */
    public static void main(String[] args) {
//        int i = 1 / 0;
        logger.info("This is info Message!!!");
        logger.debug("This is debug Message!!!");
        logger.warn("This is warn Message!!!");
        logger.error("This is error Message!!!");

        // 使用了log4j-slf4j-impl，前提是项目中没有配置文件logback.xml(如果有，则会默认去解析logback.xml的配置
        // ；对于本例，日志打印到logback目录下)
        // 使用这种配置会出现问题，部分的解析会出错，所以建议使用log4j2.xml的配置且文件名也为这个
        logger2.info("(slf4j)This is info Message!!!");
        logger2.debug("(slf4j)This is debug Message!!!");
        logger2.warn("(slf4j)This is warn Message!!!");
        logger2.error("(slf4j)This is error Message!!!");
    }
}
