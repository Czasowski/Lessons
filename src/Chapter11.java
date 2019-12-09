

class MyEx extends Exception {
	
}
class MyExTest {
	
	public static void main(String[] args) {
		String test = "yes";
		System.out.print("t");
		try {
			doRisky(test);
			System.out.print("ro");
		} catch (MyEx e) {
			System.out.print("a");
		} finally {
			System.out.print("ws");
		}
	}
	
	static void doRisky(String t) throws MyEx {
		System.out.print("h");
		if ("yes".equals(t)) {
			throw new MyEx();
		}
	}
}