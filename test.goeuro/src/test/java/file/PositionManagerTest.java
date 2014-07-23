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
	private static final String LOCATION_JSON = "[{'_id':376217,'key':null,'name':'Berlin','fullName':'Berlin, Germany','iata_airport_code':null,'type':'location','country':'Germany','geo_position':{'latitude':52.52437,'longitude':13.41053},'locationId':8384,'inEurope':true,'countryCode':'DE','coreCountry':true,'distance':null},{'_id':448103,'key':null,'name':'Berlingo','fullName':'Berlingo, Italy','iata_airport_code':null,'type':'location','country':'Italy','geo_position':{'latitude':45.50298,'longitude':10.04366},'locationId':147721,'inEurope':true,'countryCode':'IT','coreCountry':true,'distance':null},{'_id':425332,'key':null,'name':'Berlingerode','fullName':'Berlingerode, Germany','iata_airport_code':null,'type':'location','country':'Germany','geo_position':{'latitude':51.45775,'longitude':10.2384},'locationId':124675,'inEurope':true,'countryCode':'DE','coreCountry':true,'distance':null},{'_id':425333,'key':null,'name':'Berlingen','fullName':'Berlingen, Germany','iata_airport_code':null,'type':'location','country':'Germany','geo_position':{'latitude':50.23894,'longitude':6.71934},'locationId':124676,'inEurope':true,'countryCode':'DE','coreCountry':true,'distance':null},{'_id':314826,'key':null,'name':'Berlin Tegel','fullName':'Berlin Tegel (TXL), Germany','iata_airport_code':'TXL','type':'airport','country':'Germany','geo_position':{'latitude':52.5548,'longitude':13.28903},'locationId':null,'inEurope':true,'countryCode':'DE','coreCountry':true,'distance':null},{'_id':314827,'key':null,'name':'Berlin Sch�nefeld','fullName':'Berlin Sch�nefeld (SXF), Germany','iata_airport_code':'SXF','type':'airport','country':'Germany','geo_position':{'latitude':52.3887261,'longitude':13.5180874},'locationId':null,'inEurope':true,'countryCode':'DE','coreCountry':true,'distance':null}]";

	@Before
	public void init() {
		positionManager = new PositionManager();
		factory = new JsonFactory();
		try {
			String validLocationJson = LOCATION_JSON.replace('\'', '"');
			parser = factory.createJsonParser(validLocationJson);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testFile() {
		List<Position> positions;
		try {
			positions = positionManager.buildPositionList(parser);
			Assert.assertFalse(positions.isEmpty());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
