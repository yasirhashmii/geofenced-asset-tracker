package com.spatial.tracker.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spatial.tracker.repository.LocationRepository;

@Service
public class LocationService {
	
	private final LocationRepository locationRepository;
	
	public LocationService(LocationRepository locationRepository) {
		this.locationRepository =  locationRepository;
	}
	//POST Mapping
	@Transactional
	public void insertAsset(String assetName, double longitude, double latitude) {
		locationRepository.insertAsset(assetName, longitude, latitude);
	}
	//GET Mapping
	public Boolean checkAssetViolation(String assetName, double longitude, double latitude) {
		return locationRepository.checkAssetViolation(assetName, longitude, latitude);
	}
}
