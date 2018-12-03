package adapter_v2;

// インスタンスによるアダプタパターン
public class Main {
	public static void main(String[] args) {

		Print p = new PrintBanner("hello");
		p.printWeak();
		p.printStrong();
	}

}
