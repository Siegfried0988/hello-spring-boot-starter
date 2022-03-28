package kennyhome;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "kenny.home.hello")
public class HelloProperties {
    private String name;
    private String message;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
