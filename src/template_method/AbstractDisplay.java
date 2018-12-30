package template_method;

public abstract class AbstractDisplay {

	/**
	 * サブクラスに実装を任せる抽象メソッド
	 */
	public abstract void open();

	/**
	 * サブクラスに実装を任せる抽象メソッド
	 */
	public abstract void print();

	/**
	 * サブクラスに実装を任せる抽象メソッド
	 */
	public abstract void close();

	/**
	 * この抽象クラスで実装しているメソッド
	 *
	 * GoF本ではテンプレートメソッドはオーバーライドすべきではないと書かれているので サブクラスでオーバーライドできないようにfinalをつけています。
	 */
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}

}
