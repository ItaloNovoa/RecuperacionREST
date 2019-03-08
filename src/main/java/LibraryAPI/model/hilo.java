package LibraryAPI.model;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.threewks.thundr.mailgun.MessageSend;

public class hilo extends Thread {

	private String correo;
	public hilo(String correo) {
		this.correo=correo;
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
		System.out.println("sale correo");
		MGSample m= new MGSample();
		try {
			m.sendSimpleMessage(correo);
		} catch (UnirestException e) {
			e.printStackTrace();
		}
	}

}
