import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class soketserver {
	public static void main(String[] args) {
		
		try {
			ServerSocket ServerSoket = new ServerSocket(5001);
			System.out.println("server started : 5001");
		
			while(true){
				Socket soket = ServerSoket.accept();
			
				ObjectInputStream instream = new ObjectInputStream(soket.getInputStream());
				String inStr = instream.readUTF();
				
				System.out.println("inStr from client : " + inStr);
				
				ObjectOutputStream outstream = new ObjectOutputStream(soket.getOutputStream());
				outstream.writeUTF(inStr+ " from server ");
				outstream.flush();
			}
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
