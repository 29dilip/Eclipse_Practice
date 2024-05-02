package Interfaces;

class Phone
{
	public void Call(){System.out.println("Phone Call");}
	public void SMS() {System.out.println("Sms from phone");}
	
}
interface Camera
{
	public void Click();
	public void record();
	
}
interface Musicplayer
{
	public void play();
	public void pause();
	public void stop();
}
class SmartPhone extends Phone implements Camera,Musicplayer
{
	public void VideoCall(){System.out.println("Video call on SmartPhone");}
	public void Click(){System.out.println("Click on SmartPhone");}
	public void record(){System.out.println("Recording on SmartPhone");}
	public void play(){System.out.println("Playing on SmartPhone");}
	public void pause(){System.out.println("pause on SmartPhone");}
	public void stop(){System.out.println("Stop call on SmartPhone");}
}
	
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Musicplayer sp=new SmartPhone();
		sp.play();
		sp.pause();
		sp.stop();
		
	}

}
