package singleton;

public class Singleton {

	private static Singleton singleton = null;

	private Singleton() {
		System.out.println("インスタンスを生成しました");
	}

	/**
	 * synchronized 修飾子を用いて 呼び出すスレッドを1つにする
	 * 
	 * @return
	 */
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
