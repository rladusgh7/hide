
public class DigitThread extends Thread {

	public void run(){
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.print(e.getMessage());
			}
		}
	}
}
