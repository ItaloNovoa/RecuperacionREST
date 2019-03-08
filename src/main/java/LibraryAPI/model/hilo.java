package LibraryAPI.model;

import com.threewks.thundr.mailgun.MessageSend;

public class hilo extends Thread {

	public hilo() {
		run();
	}

	
	public static MessageSend respuesta() {
		 MessageSend m= new MessageSend();
		return null;
		
	}
	
	
	public void run(){
		try{
			Thread.sleep(6000);
			
		}
		catch(InterruptedException e)
		{
			System.out.println("my thread interrupted");
		}
		

	}

}
