package com.spatial.tracker.entity;

import jakarta.persistence.*;

import java.security.Timestamp;
import java.time.LocalDateTime;

import org.locationtech.jts.geom.Point;

@Entity
@Table(name = "location")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Byte id;
	
	@Column(nullable = false)
	private String asset_name;
	
	@Column(columnDefinition = "geometry(POINT, 4326")
	private Point coordinates;
	
	@Column
	private LocalDateTime recorded_at;

	public Byte getId() {
		return id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getAsset_name() {
		return asset_name;
	}

	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}

	public Point getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Point coordinates) {
		this.coordinates = coordinates;
	}

	public LocalDateTime getRecorded_at() {
		return recorded_at;
	}

	public void setRecorded_at(LocalDateTime recorded_at) {
		this.recorded_at = recorded_at;
	}
	
}
