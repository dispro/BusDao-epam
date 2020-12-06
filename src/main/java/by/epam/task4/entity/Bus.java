package by.epam.task4.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Bus {

    private Driver driver;
    private long Id;
    private long routeId;
    private String brand;
    private LocalDate startDate;
    private double mileage;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public long getId() {
        return Id;
    }

    public long getRouteId() {
        return routeId;
    }

    public void setRouteId(long routeId) {
        this.routeId = routeId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return this.Id == bus.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(driver, Id, routeId, brand, startDate, mileage);
    }
}
