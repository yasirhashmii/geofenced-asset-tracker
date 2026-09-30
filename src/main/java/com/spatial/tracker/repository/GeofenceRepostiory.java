package com.spatial.tracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spatial.tracker.entity.Geofence;

//Links functions written in Postgres here. We use a repository for that.
@Repository
public interface GeofenceRepostiory extends JpaRepository<Geofence, Integer> {
	
	@Query(value = "select * from get_containing_geofences(:longitude, :latitude)", nativeQuery = true)
	List<Geofence> getContainingGeofences(@Param("longitude") double longitude, @Param("latitude") double latitude);
	
}
