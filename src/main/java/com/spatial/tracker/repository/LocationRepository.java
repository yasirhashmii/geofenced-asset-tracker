package com.spatial.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spatial.tracker.entity.Location;

//Links functions written in Postgres here. We use a repository for that.
@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	@Query(value = "select * from insert_asset(:assetName, :longitude, :latitude)", nativeQuery = true)
	void insertAsset(@Param("assetName") String assetName, @Param("longitude") double longitude, @Param("latitude") double latitude);
	
	@Query(value = "select * from check_asset_violation(:assetName, :longitude, :latitude)", nativeQuery = true)
	Boolean checkAssetViolation(@Param("assetName") String assetName, @Param("longitude") double longitude, @Param("latitude") double latitude);
}
