package by.epam.task4.storage;

import by.epam.task4.entity.Bus;

import java.util.List;

public class BusStorage {

    private static BusStorage instance;
    private List<Bus> busStorage;

    private BusStorage(){

    }

    public static BusStorage getInstance(){
        if (instance == null){
            instance = new BusStorage();
        }
        return instance;
    }

    public List<Bus> getBuses(){
        return busStorage;
    }

}
