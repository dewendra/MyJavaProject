package singlton;

public class DBConnector {

	private static DBConnector db;

	public DBConnector() {
		System.out.println("DB Connector");
	}

	public static DBConnector createInstance() {
		if (db == null) {
			synchronized (DBConnector.class) {
				if (db == null) {

					db = new DBConnector();
				}
			}
		}
		return db;

	}

}
