package LibraryAPI.model;

public class hilo extends Thread {

	public hilo() {
		run();
	}

	public void run(){
		try{
			Thread.sleep(6000);
			
		}
		catch(InterruptedException e)
		{
			System.out.println("my thread interrupted");
		}
		System.out.println("una vez");

	}

}
