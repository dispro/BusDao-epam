package by.epam.task4.dao;

import by.epam.task4.entity.Bus;

import java.util.List;

public interface BusDao {

    void add(Bus bus);
    Bus find(long Id);
    void update(Bus bus);
    void delete(long Id);
    List<Bus> findAll();
}
