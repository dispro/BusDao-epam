package by.epam.task4.dao.impl;

import by.epam.task4.dao.BusDao;
import by.epam.task4.entity.Bus;
import by.epam.task4.storage.BusStorage;

import java.util.Comparator;
import java.util.List;

public class BusDaoImpl implements BusDao, Comparator<Bus> {

    private final List<Bus> buses;

    public BusDaoImpl(){
        this.buses = BusStorage.getInstance().getBuses();
    }

    @Override
    public List<Bus> findAll(){
        return this.buses;
    }

    @Override
    public void add(Bus bus) {
        if (this.buses.contains(bus)){
            throw new IllegalArgumentException("This bus already exist: "+bus.toString());
        }
        this.buses.add(bus);
    }

    @Override
    public Bus find(long Id) {
        Bus bus = null;
        int i = 0;
        while(bus.getId() != Id){
            if (i > this.buses.size()){
                break;
            }
            bus = this.buses.get(i);
            i++;
        }
        return bus;
    }

    @Override
    public void update(Bus bus) {
        for (Bus item : this.buses){
            if (item.getId() == bus.getId()){
                item.setDriver(bus.getDriver());
                item.setBrand(bus.getBrand());
                item.setMileage(bus.getMileage());
                item.setRouteId(bus.getRouteId());
                item.setStartDate(bus.getStartDate());
            }
        }
    }

    @Override
    public void delete(long Id) {
        int i = 0;
        int startSize = this.buses.size();
        for (Bus item : this.buses){
            if (item.getId() == Id){
                this.buses.remove(i);
            }
            i++;
        }
        if (i == startSize){
            throw new IllegalArgumentException("Entity with that Id is not exist");
        }
    }

    @Override
    public int compare(Bus o1, Bus o2) {
        return Long.compare(o1.getId(), o2.getId());
    }
}
