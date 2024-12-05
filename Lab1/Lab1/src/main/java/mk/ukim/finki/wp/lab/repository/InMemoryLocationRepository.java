package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Location;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryLocationRepository {
    public List<Location> findAll() {
        return DataHolder.locationList;
    }

    public Optional<Location> findById(Long id) {
        return DataHolder.locationList.stream().filter(location -> location.getId().equals(id)).findFirst();
    }
}