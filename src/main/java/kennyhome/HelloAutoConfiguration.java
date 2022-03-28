package kennyhome;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Hello.class)
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    @Autowired
    private HelloProperties helloProperties;

    @Bean
    @ConditionalOnMissingBean
    public HelloProperties helloProperties() {
        String name = helloProperties.getName() == null ? "kenny" : helloProperties.getName();
        String message = helloProperties.getMessage() == null ? "hello" : helloProperties.getMessage();
        HelloProperties helloProperties = new HelloProperties();
        helloProperties.setName(name);
        helloProperties.setMessage(message);
        return helloProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public Hello hello(){
        return new Hello(helloProperties());
    }


}
