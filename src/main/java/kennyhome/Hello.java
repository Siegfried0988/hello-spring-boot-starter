package kennyhome;



public class Hello {
    private HelloProperties helloProperties;

    public Hello(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello() {
        return String.format("%s: %s", helloProperties.getName(), helloProperties.getMessage());
    }

}
