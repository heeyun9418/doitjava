package Chapter10;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc = null;

		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setMute(false);	//디폴트도 필요에 따라 재정의 가능
		rc.turnOff();

		rc = new SmartTelevison();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
	
		RemoteControl.changeBattery();
	}
}
