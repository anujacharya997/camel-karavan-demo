import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

@BindToRegistry("customProcessor")
public class CustomProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getMessage().setBody("Hello World");
    }
}
