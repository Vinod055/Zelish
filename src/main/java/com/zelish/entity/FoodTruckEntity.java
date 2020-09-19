package com.zelish.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FoodTruck")
public class FoodTruckEntity {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	@Column(name="LOCATION_ID")
	private String locationid	;
	
	@Column(name="APPLICANT")
	private String applicant;	
	
	@Column(name="ST_FACILITY_TYPE")
	private String stFacilityType;
	
	@Column(name="CNN")
	private String cnn;	
	
	@Column(name="LOCATION_DESCRIPTION")
	private String locationDescription;	
	
	@Column(name="ADDRESS")
	private String address;	
	
	@Column(name="BLOCK_LOT")
	private String blocklot;	
	
	@Column(name="BLOCK")
	private String block;	
	
	@Column(name="LOT")
	private String lot;	
	
	@Column(name="PERMIT")
	private String permit;	
	
	@Column(name="STATUS")
	private String status;	
	
	@Column(name="FOOD_ITEMS")
	private String foodItems;	
	
	@Column(name="X")
	private String X;	
	
	@Column(name="Y")
	private String Y;	
	
	@Column(name="LATITUDE")
	private String latitude;	
	
	@Column(name="LONGITUDE")
	private String longitude;	
	
	@Column(name="SCHEDULE_FILEPATH")
	private String scheduleFilePath;	
	
	@Column(name="DAYS_HOURS")
	private Date dayshours;	
	
	@Column(name="NOISENT")
	private String nOISent;	
	
	@Column(name="APPROVED")
	private String approved;	
	
	@Column(name="RECEIVED")
	private String received;	
	
	@Column(name="PRIORPERMIT")
	private String priorPermit;	
	
	@Column(name="EXPIRATION_DATE")
	private Date expirationDate;	
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="FIRE_PREVENTION_DISTRICTS")
	private String firePreventionDistricts;	
	
	@Column(name="POLICE_DISTRICTS")
	private String policeDistricts;	
	
	@Column(name="SUPERVISOR_DISTRICTS")
	private String supervisorDistricts;	
	
	@Column(name="ZIP_CODES")
	private String zipCodes;
	
	@Column(name="NEIGHBORHOODS_OLD")
	private String neighborhoodsOld;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocationid() {
		return locationid;
	}

	public void setLocationid(String locationid) {
		this.locationid = locationid;
	}

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		applicant = applicant;
	}

	public String getStFacilityType() {
		return stFacilityType;
	}

	public void setStFacilityType(String stFacilityType) {
		stFacilityType = stFacilityType;
	}

	public String getCnn() {
		return cnn;
	}

	public void setCnn(String cnn) {
		this.cnn = cnn;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		locationDescription = locationDescription;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	public String getBlocklot() {
		return blocklot;
	}

	public void setBlocklot(String blocklot) {
		this.blocklot = blocklot;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getPermit() {
		return permit;
	}

	public void setPermit(String permit) {
		this.permit = permit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		status = status;
	}

	public String getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(String foodItems) {
		foodItems = foodItems;
	}

	public String getX() {
		return X;
	}

	public void setX(String x) {
		X = x;
	}

	public String getY() {
		return Y;
	}

	public void setY(String y) {
		Y = y;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		longitude = longitude;
	}

	public String getScheduleFilePath() {
		return scheduleFilePath;
	}

	public void setScheduleFilePath(String schedule) {
		scheduleFilePath = schedule;
	}

	public Date getDayshours() {
		return dayshours;
	}

	public void setDayshours(Date dayshours) {
		this.dayshours = dayshours;
	}

	public String getNOISent() {
		return nOISent;
	}

	public void setNOISent(String nOISent) {
		nOISent = nOISent;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		approved = approved;
	}

	public String getReceived() {
		return received;
	}

	public void setReceived(String received) {
		received = received;
	}

	public String getPriorPermit() {
		return priorPermit;
	}

	public void setPriorPermit(String priorPermit) {
		priorPermit = priorPermit;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		expirationDate = expirationDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		location = location;
	}

	public String getFirePreventionDistricts() {
		return firePreventionDistricts;
	}

	public void setFirePreventionDistricts(String firePreventionDistricts) {
		firePreventionDistricts = firePreventionDistricts;
	}

	public String getPoliceDistricts() {
		return policeDistricts;
	}

	public void setPoliceDistricts(String policeDistricts) {
		policeDistricts = policeDistricts;
	}

	public String getSupervisorDistricts() {
		return supervisorDistricts;
	}

	public void setSupervisorDistricts(String supervisorDistricts) {
		supervisorDistricts = supervisorDistricts;
	}

	public String getZipCodes() {
		return zipCodes;
	}

	public void setZipCodes(String zipCodes) {
		zipCodes = zipCodes;
	}

	public String getNeighborhoodsOld() {
		return neighborhoodsOld;
	}

	public void setNeighborhoodsOld(String neighborhoodsOld) {
		neighborhoodsOld = neighborhoodsOld;
	}
	

}
