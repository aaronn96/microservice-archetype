package ${package}.boot;

import ${package}.core.AppInfoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainBootApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainBootApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MainBootApplication.class, args);
        AppInfoBean appInfo = context.getBean(AppInfoBean.class);
        LOGGER.info("!!! Started application {} on port {} !!!", appInfo.getName(), appInfo.getPort());
    }

}