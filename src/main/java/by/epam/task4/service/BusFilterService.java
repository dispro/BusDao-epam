package by.epam.task4.service;

import by.epam.task4.dao.BusDao;
import by.epam.task4.dao.impl.BusDaoImpl;
import by.epam.task4.entity.Bus;
import by.epam.task4.storage.BusStorage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BusFilterService {

    private final BusDao buses = new BusDaoImpl();

    public List<Bus> findBusByRouteId(long routeId){
        List<Bus> result = new ArrayList<Bus>();
        for (Bus bus: buses.findAll()){
            if (bus.getRouteId() == routeId){
                result.add(bus);
            }
        }
        return result;
    }

    public List<Bus> findByOperationalLife(int operatLife){
        List<Bus> result = new ArrayList<Bus>();
        LocalDate today = LocalDate.now();
        for (Bus bus: buses.findAll()){
            if (today.getYear() - bus.getStartDate().getYear() > operatLife){
                result.add(bus);
            }
        }
        return result;
    }

    public List<Bus> findByMileage(int mileage){
        List<Bus> result = new ArrayList<Bus>();
        for (Bus bus: buses.findAll()){
            if (bus.getMileage() > mileage){
                result.add(bus);
            }
        }
        return result;
    }
}
