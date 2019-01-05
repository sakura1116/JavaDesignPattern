package builder;

public class Main {

	public static void main(String[] args) {
		// Director director = new Director(new TextBuilder());
		// String result = (String) director.construct();
		// System.out.println(result);
		Director director = new Director(new HTMLBilder());
		String filename = (String) director.construct();
		System.out.println(filename + "が作成されました");

		// if (args.length != 1) {
		// System.exit(0);
		// }
		// if (args[0].equals("plain")) {
		// Director director = new Director(new TextBuilder());
		// String result = (String) director.construct();
		// System.out.println(result);
		// } else if (args[0].equals("html")) {
		// Director director = new Director(new HTMLBilder());
		// String filename = (String) director.construct();
		// System.out.println(filename + "が作成されました");
		// } else {
		// // System.exit(0);
		// }
	}
}
