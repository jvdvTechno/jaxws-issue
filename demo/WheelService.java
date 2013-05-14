package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface = "demo.IWheelService")
public class WheelService implements IWheelService {
    private List<Wheel> wheels = new ArrayList<>();

    public WheelService() {
        Bike bike = new Bike("red");
        Wheel frontWheel = new Wheel(bike, "slick");
        Wheel rearWheel = new Wheel(bike, "spike");

        wheels.add(frontWheel);
        wheels.add(rearWheel);
    }

    @Override
    public Collection<Wheel> getAllWheels() {
        return wheels;
    }

    // Run with -Dcom.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=true for debugging
    public static void main(String[] args) throws IOException {
        Endpoint ep = Endpoint.publish("http://localhost:9001/wheel", new WheelService());
        System.out.println("Endpoint published, press return to terminate.");
        System.in.read();
        ep.stop();
        System.out.println("Finished.");
    }
}
