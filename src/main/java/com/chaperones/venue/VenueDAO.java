package com.chaperones.venue;

import com.chaperones.activity.Activity;

import java.util.List;

public interface VenueDAO {
    public int add(Venue venue);
    public List<Venue> getAll();
    public List<Activity> getAllActivities(Integer id);
    public Venue getById(Integer id);
    public int updateById(Integer id, Venue update);
    public int deleteById(Integer id);
}
