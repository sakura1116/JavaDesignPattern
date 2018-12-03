package adapter.practice;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileIO f = new FileProperties();
		String path = System.getProperty("user.dir");

		try {
			f.readFromFile(path + "/src/adapter/practice/file.txt");
			f.setValue("year", "2018");
			f.setValue("month", "12");
			f.setValue("day", "03");
			f.writeToFile(path + "/src/adapter/practice/newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
