package com.logging.demo;


import java.util.logging.Logger;

/**
 * description  JDKLog <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:03  2023/2/10
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class JDKLog {

    /**
     * 无需引入pom依赖，使用jdk内置的日志
     * JDK默认的logging配置文件为：$JAVA_HOME/jre/lib/logging.properties，
     * 可以使用系统属性java.util.logging.config.file指定相应的配置文件对默认的配置文件进行覆盖
     * ，比如， java -Djava.util.logging.config.file=myfile
     */
    private static Logger log = Logger.getLogger(JDKLog.class.toString());

    public static void main(String[] args) {
        log.info("信息");
        log.warning("警告");
        log.severe("严重");
    }
}
