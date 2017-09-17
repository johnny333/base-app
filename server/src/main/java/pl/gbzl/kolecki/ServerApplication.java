package pl.gbzl.kolecki;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import pl.gbzl.kolecki.config.CorsConfig;

import java.net.InetAddress;
import java.net.UnknownHostException;

@EnableAutoConfiguration
@EnableScheduling
@EnableTransactionManagement
@EntityScan(basePackages = {"pl.gbzl.kolecki.app.data"})
@EnableJpaRepositories(
        basePackages = {"pl.gbzl.kolecki.app.repository"})
@ComponentScan({"pl.gbzl.kolecki.app.data"})
@Import({CorsConfig.class})

@SpringBootApplication(scanBasePackages = {"pl.gbzl.kolecki.app"})
@Slf4j
public class ServerApplication {

    public static void main(String[] args) throws UnknownHostException {

        SpringApplication pApp = new SpringApplication(ServerApplication.class);
        Environment pEnv = pApp.run(args).getEnvironment();
        final String pPort = pEnv.getProperty("server.port");
        final String pHost = InetAddress.getLocalHost().getHostAddress();
        log.info("Access URLs:\n----------------------------------------------------------\n\t" +
                        "Local: \t\thttp://{}:{}\n\t" +
                        "External: \thttp://{}:{}\n\t" +
                        "----------------------------------------------------------\n\t",
                pHost, pPort,
                pHost, pPort);
    }
}
