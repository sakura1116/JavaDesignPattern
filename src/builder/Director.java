package builder;

public class Director {

	private Builder builder;

	// Builderのサブクラスのインスタンスが与えられるので、builderフィールドに保持しておく
	public Director(Builder builder) {
		this.builder = builder;
	}

	/**
	 * 構築します (・∀・)
	 * 
	 * @return
	 */
	public Object construct() {
		builder.makeTitle("Greeting");
		builder.makeString("朝からひるにかけて");
		builder.makeItems(new String[] { "おはようございます", "こんにちは" });
		builder.makeString("夜に");
		builder.makeItems(new String[] { "こんばんは。", "おやすみなさい", "さようなら。" });

		// 組み上げた文書が戻り値になる
		return builder.getResult();
	}
}
