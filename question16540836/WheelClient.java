package question16540836;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class WheelClient {

    public static void main(String[] args) throws MalformedURLException {
        QName qname = new QName("http://question16540836/", "WheelServiceService");
        Service service = Service.create(new URL("http://localhost:9001/wheel?WSDL"), qname);

        IWheelService wheelService = service.getPort(IWheelService.class);
        for (Wheel wheel: wheelService.getAllWheels()) {
            System.out.println(wheel + ": " + wheel.getBike());
        }
    }
}
