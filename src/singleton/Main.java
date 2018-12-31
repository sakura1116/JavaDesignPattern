package singleton;

public class Main {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1.equals(obj2)) {
			System.out.println("same instance");
		} else {
			System.out.println("not same instance");
		}
	}

}
