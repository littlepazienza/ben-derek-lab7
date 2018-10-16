
abstract class ExpressionTree 
{
	abstract protected  String operation;
  public abstract int evaluate();
	public abstract boolean canEvaluate();
}

class Number extends ExpressionTree
{
  protected int value;

  public Number(int v) { value = v; } 
  public int evaluate() { return value; } 
  
}

class Plus extends ExpressionTree
{
	operation = "+";

	protected ExpressionTree left, right;
	
	public Plus(ExpressionTree l, ExpressionTree r)
	{
		left =l;
		right = r;
	}

	public int evaluate()
	{
		return left + right;
	}
}

class Minus extends ExpressionTree
{
	operation = "-";

	protected ExpressionTree left, right;
	
	public Minus(ExpressionTree l, ExpressionTree r)
	{
		left = l;
		right = r;
	}

	public int evaluate()
	{
		return left - right;
	}

}

class Times extends ExpressionTree
{
	operation = "*";

	protected ExpressionTree left, right;
	
	public Times(ExpressionTree l, ExpressionTree r)
	{
		left = l;
		right = r;
	}

	public int evaluate()
	{
		return left * right;
	}

}

class Divide extends ExpressionTree
{
	operation = "/";

	protected ExpressionTree left, right;

	public Divide(ExpressionTree l, ExpressionTree r)
	{	
		left = l;
		right = r;
	}

	public int evaluate()
	{
		return left / right;
	}

}

class Negation extends ExpressionTree
{
	operation = "neg";

	protected ExpressionTree left, right;




