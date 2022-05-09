
public class SelectToDo {
	   private Strategy strategy;

	   public SelectToDo(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }
}
