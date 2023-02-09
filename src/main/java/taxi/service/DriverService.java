package taxi.service;

import java.util.Optional;
import taxi.model.Driver;

public interface DriverService extends GenericService<Driver> {
    public Optional<Driver> findByLogin(String login);
}
