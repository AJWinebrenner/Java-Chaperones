package com.chaperones.activity;

import java.util.Objects;

public class Activity {
    private Integer id;
    private String name;
    private String description;
    private String date;
    private String time;
    private String duration;
    private Double price;
    private Integer capacity;
    private Boolean cancelled;

    public Activity(Integer id, String name, String description, String date, String time, String duration, Double price, Integer capacity, Boolean cancelled) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.price = price;
        this.capacity = capacity;
        this.cancelled = cancelled;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", duration='" + duration + '\'' +
                ", price=" + price +
                ", capacity=" + capacity +
                ", cancelled=" + cancelled +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(id, activity.id) && Objects.equals(name, activity.name) && Objects.equals(description, activity.description) && Objects.equals(date, activity.date) && Objects.equals(time, activity.time) && Objects.equals(duration, activity.duration) && Objects.equals(price, activity.price) && Objects.equals(capacity, activity.capacity) && Objects.equals(cancelled, activity.cancelled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, date, time, duration, price, capacity, cancelled);
    }
}
