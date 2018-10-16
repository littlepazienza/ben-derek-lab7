
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

abstract class Operation extends ExpressionTree
{
	protected ExpressionTree left, right;

	public Operation( ExpressionTree l, ExpressionTree r )
	{
		left = l;
		right = r;
	}
	
	public boolean canEvaluate() { return true; }
}

class Plus extends Operation
{
	public Plus(ExpressionTree l, ExpressionTree r)
	{
		super(l, r);
	}


