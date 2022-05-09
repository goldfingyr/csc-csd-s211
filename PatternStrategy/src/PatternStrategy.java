
public class PatternStrategy {
	   public static void main(String[] args) {
		      SelectToDo toDo1 = new SelectToDo(new DoAdd());		
		      System.out.println("3 + 2 = " + toDo1.executeStrategy(3, 2));

		      SelectToDo toDo2 = new SelectToDo(new DoSubtract());		
		      System.out.println("3 - 2 = " + toDo2.executeStrategy(3, 2));

		      SelectToDo toDo3 = new SelectToDo(new DoMultiply());		
		      System.out.println("3 * 2 = " + toDo3.executeStrategy(3, 2));
		   }
}
