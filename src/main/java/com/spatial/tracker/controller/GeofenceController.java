package com.spatial.tracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spatial.tracker.entity.Geofence;
import com.spatial.tracker.service.GeofenceService;

@RestController
@RequestMapping("/api/geofences")
public class GeofenceController {
	
	private final GeofenceService geofenceService;
	
	public GeofenceController(GeofenceService geofenceService) {
		this.geofenceService = geofenceService;
	}
	
	@GetMapping("/check")
	public List<Geofence> getContainingGeofences(@RequestParam double longitude, @RequestParam double latitude){
		return geofenceService.getContainingGeofences(longitude, latitude);
	}
	
}
