package demo;

import java.util.Collection;

import javax.jws.WebService;

@WebService
public interface IWheelService {
    public abstract Collection<Wheel> getAllWheels();
}