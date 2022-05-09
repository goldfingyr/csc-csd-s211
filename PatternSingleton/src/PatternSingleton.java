public class PatternSingleton {
	public static void main(String[] args) {
		//Get the only object available
		Singleton object = Singleton.getInstance();
		
		//show the message
		object.showMessage();
	}
}
