package file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import pojo.Position;

public class FileGenerator {

	private static final String FILE_NAME = "GoEuroTest.csv";

	private static final String CSV_FILE_HEADER = "_id,name,type,latitude,longitude\n";
	
	public void generateCsvFile(List<Position> positionList) {
   
		try {
			FileWriter writer = new FileWriter(FILE_NAME);
			
			writer.append(CSV_FILE_HEADER);

			for (Position position : positionList) {
				writer.append(position.getId()+"");
				writer.append(",");
				writer.append(position.getName());
				writer.append(",");
				writer.append(position.getType());
				writer.append(",");
				writer.append(position.getGeo_position().getLatitude() + "");
				writer.append(",");
				writer.append(position.getGeo_position().getLongitude() + "");
				writer.append("\n");
			}

			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
