package miluo.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Miluo
 * @className ScriptRunnerUtil
 * @description java使用ScriptRunner可执行sql脚本文件
 * @date 2021/8/17
 **/
@Slf4j
public class ScriptRunnerUtil {
    @Value("${spring.datasource.url}")
    private  String url;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driver;

    public String process() {
        log.info("process start");
        try(Connection conn = DriverManager.getConnection(url, userName, password)) {
            Class.forName(driver).newInstance();
            ScriptRunner runner = new ScriptRunner(conn);

            //设置字符集,不然中文乱码插入错误
            Resources.setCharset(StandardCharsets.UTF_8);
            //设置是否输出日志
            runner.setLogWriter(null);
            runner.runScript(new FileReader(new File("xxxx")));
            runner.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("process end");
        return "success";
    }
}

