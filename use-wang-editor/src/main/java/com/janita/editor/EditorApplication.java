package com.janita.editor;

import com.janita.editor.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by Janita on 2017/6/16 0016-下午 5:07
 * 该类是：
 */
@SpringBootApplication
@EnableConfigurationProperties(Config.class)
public class EditorApplication {

    public static void main(String[] args) {
        SpringApplication.run(EditorApplication.class, args);
    }
}
