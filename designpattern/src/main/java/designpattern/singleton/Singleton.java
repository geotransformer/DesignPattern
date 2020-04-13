package designpattern.singleton;

class Singleton {
	private volatile static Singleton instance;

	private Singleton() {
	}

	// not synchronize on method level to improve concurrency
	public static Singleton getInstance() {
		if (instance == null) {
			// This makes thread safe
			synchronized (Singleton.class) {
				// check again as multiple threads
				// can reach above statements
				// when current thread acquired the monitor of class object
				// the instance might be instantiated already
				if (instance == null)
					instance = new Singleton();
			}
		}
		return instance;
	}
}
