package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import Class.Employee;

public interface IOUtils {

	public static void store(String filename, Map<String, Employee> ma) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			// Java App --> OOS --> FOS --> bin file

			out.writeObject(ma);
		}

	}

	public static Map<String, Employee> restore(String filename) throws IOException, ClassNotFoundException {
		// Java App <----- OIS: deserializer<-----FIS : node strm<---- Bin File
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {

			return (Map<String, Employee>) in.readObject();

		} catch (Exception e) {
			System.out.println("Error during de-serialization" + e);
			return new HashMap<>();
		}

	}

}
