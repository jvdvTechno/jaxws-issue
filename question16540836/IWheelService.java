package question16540836;

import java.util.Collection;

import javax.jws.WebService;

@WebService
public interface IWheelService {
    Collection<Wheel> getAllWheels();
}