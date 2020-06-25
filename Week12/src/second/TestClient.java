package second;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {

	public static void main(String[] args) {
		try(	Socket c = new Socket("localhost",9999);
				OutputStream os = c.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);)
		{
			oos.writeObject("æ»≥Á«œººø‰!! ");
			oos.flush();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}