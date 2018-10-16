
abstract class ExpressionTree 
{
  public abstract int evaluate();
	public abstract boolean canEvaluate();
}

class Number extends ExpressionTree
{
  protected int value;

  public Number(int v) { value = v; } 
  public int evaluate() { return value; } 
  public boolean canEvaluate() { return false; }
}

class Operation extends ExpressionTree
{
	protected String value;
	protected ExpressionTree left, right

	public Operation( String v, ExpressionTree l, ExpressionTree r )
	{
		value = v;
		left = l;
		right = r;
	}

	public int evaluate()
	{
		switch(value)
		{
			case "+":return left.evaluate() + right.evaluate();
			case "-":return left.evaluate() - right.evaluate();
			case "*":return left.evaluate() * right.evaluate();
			case "/":return left.evaluate() / right.evaluate();
			case "neg":return -1; //TODO
			case "abs":return Math.abs(-1); //TODO
			default: reutnr -1;
		}
	}

	public boolean canEvaluate() { return true; }
}

class Tree
{
	protected Operation root;

	public Tree()
	{
		root = null;
	}

	public void addOperation(Operation o)
	{
		findSpotForOperation(root, o);
	}

	//parses through tree finds first open spot for operation and adds it
	private boolean findSportForOperation( Operation r, Operation o)
	{
		if(isFull())
			return false;

			
	}





