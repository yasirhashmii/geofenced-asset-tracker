package com.spatial.tracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spatial.tracker.service.LocationService;

@RestController
@RequestMapping("/api/location")
public class LocationController {
	
	private final LocationService locationService;
	
	public LocationController(LocationService locationService) {
		this.locationService = locationService;
	}
	
	@PostMapping("/save")
	public void insertAsset(@RequestParam String assetName, @RequestParam double longitude, @RequestParam double latitude) {
		locationService.insertAsset(assetName, longitude, latitude);
	}
	
	@GetMapping("/violation")
	public Boolean checkAssetViolation(@RequestParam String assetName, @RequestParam double longitude, @RequestParam double latitude) {
		return locationService.checkAssetViolation(assetName, longitude, latitude);
	}
	
}
