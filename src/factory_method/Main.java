package factory_method;

import factory_method.framework.Factory;
import factory_method.framework.Product;
import factory_method.idcard.IDCardFactory;

public class Main {
	public static void main(String[] args) {

		Factory factory = new IDCardFactory();
		Product card1 = factory.create("test01");
		card1.use();

	}

}
