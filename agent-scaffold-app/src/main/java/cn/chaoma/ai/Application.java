package cn.chaoma.ai;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Configurable
public class Application {
    /**
     * test
     *
     * nihao
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

}
