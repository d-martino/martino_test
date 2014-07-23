package pojo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;


public class Position implements Serializable {	

	private static final long serialVersionUID = 1L;

	@JsonProperty("_id")
	private int id;
	
	private Object key;	
	
	private String name;	
	
	private String fullName;	
	
	private String iata_airport_code;
	
	private String type;
	
	private String country;
	
	private GeoPosition geo_position;
	
	private int locationId;
	
	private boolean inEurope;
	
	private String countryCode;
	
	private boolean coreCountry;
	
	private Object distance;

	public int getId() {
		return id;
	}

	public Object getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

	public String getFullName() {
		return fullName;
	}

	public String getIata_airport_code() {
		return iata_airport_code;
	}

	public String getType() {
		return type;
	}

	public String getCountry() {
		return country;
	}

	public GeoPosition getGeo_position() {
		return geo_position;
	}

	public int getLocationId() {
		return locationId;
	}

	public boolean isInEurope() {
		return inEurope;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public boolean isCoreCountry() {
		return coreCountry;
	}

	public Object getDistance() {
		return distance;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setIata_airport_code(String iata_airport_code) {
		this.iata_airport_code = iata_airport_code;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setGeo_position(GeoPosition geo_position) {
		this.geo_position = geo_position;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public void setInEurope(boolean inEurope) {
		this.inEurope = inEurope;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setCoreCountry(boolean coreCountry) {
		this.coreCountry = coreCountry;
	}

	public void setDistance(Object distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", key=" + key + ", name=" + name
				+ ", fullName=" + fullName + ", iata_airport_code="
				+ iata_airport_code + ", type=" + type + ", country=" + country
				+ ", geo_position=" + geo_position + ", locationId="
				+ locationId + ", inEurope=" + inEurope + ", countryCode="
				+ countryCode + ", coreCountry=" + coreCountry + ", distance="
				+ distance + "]";
	}	
}