package pojo;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoPosition implements Serializable {

	private static final long serialVersionUID = 1L;

	private double latitude;
	
	private double longitude;

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "GeoPosition [latitude=" + latitude + ", longitude=" + longitude
				+ "]";
	}

}
