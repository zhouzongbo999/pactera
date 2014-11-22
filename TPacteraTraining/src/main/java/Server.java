

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class Server {
	public static final String IP="LOCALHOST";
	public static final int PORT=8888;
	private ServerSocket serverSocket;
	private int countor=0;
	private HashMap<String,Socket> socketMap=new HashMap<String,Socket>();
	public void startup(){
		try {
			serverSocket=new ServerSocket(PORT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Comes online");
		try {
			while(true){
				Socket socket=serverSocket.accept();
				countor++;
				socketMap.put(countor+"",socket);
				new Thread(new ReceiveMessage(socket)).start();;
				System.out.println("connected "+countor);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private class ReceiveMessage implements Runnable{
		private Socket socket;
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
//					System.out.println(s.substring(0,3));
					if(s.substring(0, 3).equals("all")){
						System.out.println("群发 "+s);
						int count=0;
						Iterator<Socket> it=socketMap.values().iterator();
						System.out.println("client size: "+socketMap.values().size());
						while(it.hasNext()){
							count++;
							System.out.println(count);
							Socket ss=it.next();
							DataOutputStream out=new DataOutputStream(ss.getOutputStream());
							out.writeUTF(s);
						}
						System.out.println("群发完毕");
					}
					
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		ReceiveMessage(Socket socket){
			this.socket=socket;
		}
	}
	public static void main(String [] args){
		Server server=new Server();
		server.startup();
	}
}
