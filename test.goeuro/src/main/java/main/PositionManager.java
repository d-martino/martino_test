package main;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojo.Position;

public class PositionManager {
	
	public static final int HTTP_STATUS_OK = 200;

	public List<Position> getPositionsFromUrl(URL url) {
		List<Position> positions = new ArrayList<Position>();
		HttpURLConnection httpConnection;
		JsonFactory jsonFactory = new JsonFactory();
		JsonParser parser = null;
		try {
			httpConnection = (HttpURLConnection) url.openConnection();
			httpConnection.setRequestMethod("GET");
			httpConnection.setRequestProperty("Accept", "application/json");

			if (httpConnection.getResponseCode() != HttpURLConnection.HTTP_OK) {
				throw new RuntimeException(" HTTP GET Failed: " + httpConnection.getResponseCode());
			}

			parser = jsonFactory.createJsonParser(httpConnection.getInputStream());
			positions = buildPositionList(parser);
			
			httpConnection.disconnect();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return positions;

	}

	public List<Position> buildPositionList(JsonParser jp) throws JsonParseException,
	JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Position> positions = new ArrayList<Position>();
		jp.nextToken();
		while (jp.nextToken() == JsonToken.START_OBJECT) {
			Position position = mapper.readValue(jp, Position.class);
			positions.add(position);
		}
		return positions;
	}

}
