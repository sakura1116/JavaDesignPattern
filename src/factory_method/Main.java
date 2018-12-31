package factory_method;

import factory_method.framework.Factory;
import factory_method.framework.Product;
import factory_method.idcard.IDCardFactory;

public class Main {
	public static void main(String[] args) {

		Factory factory = new IDCardFactory();
		Product card1 = factory.create("test01");
		Product card2 = factory.create("test02");
		card1.use();
		card2.use();

	}

}
