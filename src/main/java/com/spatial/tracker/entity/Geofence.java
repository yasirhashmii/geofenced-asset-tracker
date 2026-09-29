package com.spatial.tracker.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Polygon;

@Entity
@Table(name = "geofences")
public class Geofence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Byte id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(columnDefinition = "geometry(POLYGON,4326)")
	private Polygon boundary;

	public Byte getId() {
		return id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Polygon getBoundary() {
		return boundary;
	}

	public void setBoundary(Polygon boundary) {
		this.boundary = boundary;
	}
	
	
}
