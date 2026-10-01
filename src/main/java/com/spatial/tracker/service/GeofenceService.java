package com.spatial.tracker.service;

import java.util.List;
import com.spatial.tracker.entity.Geofence;
import org.springframework.stereotype.Service;

import com.spatial.tracker.repository.GeofenceRepostiory;

@Service
public class GeofenceService {
	
	private final GeofenceRepostiory geofenceRepostiory;
	
	public GeofenceService(GeofenceRepostiory geofenceRepostiory) {
		this.geofenceRepostiory = geofenceRepostiory;
	}
	
	public List<Geofence> getContainingGeofences(double longitude, double latitude){
		return geofenceRepostiory.getContainingGeofences(longitude,latitude);
	}
	
}
