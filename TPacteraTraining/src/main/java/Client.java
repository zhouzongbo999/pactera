

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Iterator;

public class Client {
	private Socket socket;
	public Client(){
		try {
			socket=new Socket(Server.IP, Server.PORT);
			new Thread(new ReceiveMessage()).start();
			new Thread(new SendMessage()).start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String [] args){
		Client client=new Client();
	}
	private class SendMessage implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			String s="tony test";
			String receive="";
			try {
				BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream out=new DataOutputStream(socket.getOutputStream());
				while(true){
					s=reader.readLine();
					out.writeUTF(s);
//					try {
//						Thread thread=Thread.currentThread();
//						System.out.println("client sleep 6000 start");
//						thread.sleep(6000);
//						System.out.println("client sleep 6000 end");
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					System.out.println("send message: "+s);
//					DataInputStream input=new DataInputStream(socket.getInputStream());
//					receive=input.readUTF();
//					System.out.println("receive: "+receive);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}}
	private class ReceiveMessage implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				DataInputStream input=new DataInputStream(socket.getInputStream());
				String s="";
				while(true){
					s=input.readUTF();
//					try {
//						Thread thread=Thread.currentThread();
//						System.out.println("client sleep 6000 start");
//						thread.sleep(6000);
//						System.out.println("client sleep 6000 end");
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					System.out.println("get Message: "+s);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
