package file;

import java.io.IOException;
import java.util.List;

import main.PositionManager;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pojo.Position;

public class PositionManagerTest {

	private PositionManager positionManager;
	private JsonFactory factory;
	private JsonParser parser;

	private static final String LOCATION_JSON = "[ {  '_type': 'Position',  '_id': 377078,  'key': null,  'name': 'Potsdam',  'fullName': 'Potsdam, Germany',  'iata_airport_code': null,  'type': 'location',  'country': 'Germany',  'geo_position': {  'latitude': 52.39886,  'longitude': 13.06566  },  'location_id': 377078,  'inEurope': true,  'countryCode': 'DE',  'coreCountry': true,  'distance': null }, {  '_type': 'Position',  '_id': 410978,  'key': null,  'name': 'Potsdam',  'fullName': 'Potsdam, USA',  'iata_airport_code': null,  'type': 'location',  'country': 'USA',  'geo_position': {  'latitude': 44.66978,  'longitude': -74.98131  },  'location_id': 410978, 'inEurope': false,  'countryCode': 'US',  'coreCountry': false, ' distance': null } ]";
	
	@Before
	public void init() {
		positionManager = new PositionManager();
		factory = new JsonFactory();
		try {
			String validLocationJson = LOCATION_JSON.replace('\'', '"');
			parser = factory.createJsonParser(validLocationJson);
		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

	@Test
	public void testFile() {
		List<Position> positions;
		try {
			positions = positionManager.buildPositionList(parser);
			Assert.assertFalse(positions.isEmpty());
		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

}
