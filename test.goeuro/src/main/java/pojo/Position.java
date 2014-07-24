package pojo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Position implements Serializable {	

	private static final long serialVersionUID = 1L;

	@JsonProperty("_id")
	private int id;
	
	@JsonProperty("_type")
	private String firstType;
	
	private String name;	
	
	private String type;
	
	private GeoPosition geo_position;

	public int getId() {
		return id;
	}

	public String getFirstType() {
		return firstType;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public GeoPosition getGeo_position() {
		return geo_position;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstType(String firstType) {
		this.firstType = firstType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setGeo_position(GeoPosition geo_position) {
		this.geo_position = geo_position;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", firstType=" + firstType + ", name="
				+ name + ", type=" + type + ", geo_position=" + geo_position
				+ "]";
	}	
}