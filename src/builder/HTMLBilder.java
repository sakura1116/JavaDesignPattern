package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBilder implements Builder {

	private String filename;

	private PrintWriter writer;

	public void makeTitle(String title) {
		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");

		// タイトルを出力
		writer.println("<h1>" + title + "</h1>");
	}

	public void makeString(String string) {
		writer.println("<p>" + string + "</p>");
	}

	public void makeItems(String[] items) {
		writer.println("<ul>");
		for (int i = 0; i < items.length; i++) {
			writer.println("li" + items[i] + "/li");
		}
		writer.println("</ul>");
	}

	public Object getResult() {
		writer.println("</body></html>");
		writer.close();
		return filename;
	}

}
