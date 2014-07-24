package main;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import pojo.Position;
import file.FileGenerator;

public class GoEuroTest {

	private static String SERVICE_URL = "http://api.goeuro.com/api/v2/position/suggest/en/";

	public static void main(String[] args) {
		try {			
			if (args.length >= 1) {
				String input = args[0];
				FileGenerator fileGenerator = new FileGenerator();
				PositionManager positionManager = new PositionManager();
				URL url = new URL(SERVICE_URL + input);

				List<Position> positions = positionManager.getPositionsFromUrl(url);
				fileGenerator.generateCsvFile(positions);
			} else {
				System.out.println("Please, enter a location name.");
			}
		} catch (IOException e) {
			System.out.println("Something goes wrong with the URL, try later.");
		}
	}
}
