package factory_method.idcard;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import factory_method.framework.Factory;
import factory_method.framework.Product;

public class IDCardFactory extends Factory {

	private Hashtable<String, Integer> database = new Hashtable<String, Integer>();
	private List<String> owners = new ArrayList<String>();
	private int serial = 100;

	// protected Product createProduct(String owner) {
	// return new IDCard(owner);
	// }

	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}

	// protected void registerProduct(Product product) {
	// owners.add(((IDCard) product).getOwner());
	// }

	protected void registerProduct(Product product) {
		// owners.add(((IDCard) product).getOwner());
		IDCard card = (IDCard) product;
		database.put(card.getOwner(), card.getSerial());
	}

	public Hashtable<String, Integer> getDatabase() {
		return database;
	}

	public List<String> getOwners() {
		return owners;
	}

}
