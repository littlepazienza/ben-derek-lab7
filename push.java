import java.lang.Math;

abstract class ExpressionTree 
{
  protected  String operation;
  public abstract int evaluate();
  public abstract String preOrder();
  public abstract String inOrder();
  public abstract String postOrder();
}

class Number extends ExpressionTree
{
  protected int value;

  public Number(int v) { value = v; } 
  public int evaluate() { return value; }
  public String preOrder(){ return " " + value + " ";}
  public String inOrder(){ return " " + value + " ";}
  public String postOrder(){ return " " + value + " ";}
  
}

class Plus extends ExpressionTree
{
	protected ExpressionTree left, right;

	public Plus(ExpressionTree l, ExpressionTree r)
	{
		operation = "+";
		left =l;
		right = r;
	}

	public int evaluate()
	{
		return left.evaluate() + right.evaluate();
	}

	public String preOrder()
	{
		return operation + left.preOrder() + right.preOrder();
	}
	
	public String inOrder()
	{
		return "(" + left.inOrder() + operation + right.inOrder() + ")";
	}
	public String postOrder()
        {
                return left.postOrder() + right.postOrder() + operation;
        }

}

class Minus extends ExpressionTree
{

	protected ExpressionTree left, right;
	
	public Minus(ExpressionTree l, ExpressionTree r)
	{
		operation = "-";
		left = l;
		right = r;
	}

	public int evaluate()
	{
		return left.evaluate() - right.evaluate();
	}

	public String preOrder()
        {
                return operation + left.preOrder() + right.preOrder();
        }

        public String inOrder()
        {
                return "(" + left.inOrder() + operation + right.inOrder() + ")";
        }
        public String postOrder()
        {
                return left.postOrder() + right.postOrder() + operation;
        }
}

class Times extends ExpressionTree
{

	protected ExpressionTree left, right;
	
	public Times(ExpressionTree l, ExpressionTree r)
	{
		operation = "*";
		left = l;
		right = r;
	}

	public int evaluate()
	{
		return left.evaluate() * right.evaluate();
	}
	
	public String preOrder()
        {
                return operation + left.preOrder() + right.preOrder();
        }

        public String inOrder()
        {
                return "(" + left.inOrder() + operation + right.inOrder() + ")";
        }
        public String postOrder()
        {
                return left.postOrder() + right.postOrder() + operation;
        }

}

class Divide extends ExpressionTree
{

	protected ExpressionTree left, right;

	public Divide(ExpressionTree l, ExpressionTree r)
	{
		operation = "/";	
		left = l;
		right = r;
	}

	public int evaluate()
	{
		return left.evaluate() / right.evaluate();
	}

	public String preOrder()
        {
                return operation + left.preOrder() + right.preOrder();
        }

        public String inOrder()
        {
                return "(" + left.inOrder() + operation + right.inOrder() + ")";
        }
        public String postOrder()
        {
                return left.postOrder() + right.postOrder() + operation;
        }

}

class Negation extends ExpressionTree
{

	protected ExpressionTree leaf;

	public Negation(ExpressionTree l)
	{
	  operation = "neg";
	  leaf = l;
	}

	public int evaluate()
	{
	  return -1 * leaf.evaluate();
	}

	public String preOrder()
        {
                return operation + leaf.preOrder();
        }

        public String inOrder()
        {
                return operation + "(" + leaf.inOrder() + ")";
        }
        public String postOrder()
        {
                return leaf.postOrder() + operation;
        }

}

class Abs extends ExpressionTree
{

	protected ExpressionTree leaf;

	public Abs(ExpressionTree l)
	{
	  operation = "abs";
	  leaf = l;
	}

	public int evaluate()
	{
		return Math.abs(leaf.evaluate());
	}

	public String preOrder()
        {
                return operation + leaf.preOrder();
        }

        public String inOrder()
        {
                return operation + "(" + leaf.inOrder() + ")";
        }
        public String postOrder()
        {
                return leaf.postOrder() + operation;
        }

}

class Driver
{
	public static void main(String[] args)
	{
		ExpressionTree e1 = new Plus(new Number(5), new Number(3));
		ExpressionTree e2 = new Minus(new Number(7), new Number(2));
		ExpressionTree e3 = new Times(new Number(10), new Number(2));
		ExpressionTree e4 = new Divide(new Number(10), new Number(5));
 		ExpressionTree e5 = new Negation(new Number(2));
		ExpressionTree e6 = new Abs(new Number(-5));
    
		System.out.println("PreOrder: " + e1.preOrder() + "= " + e1.evaluate());
		System.out.println("InOrder: " + e2.inOrder() + " = " +  e2.evaluate());
		System.out.println("PostOrder: " + e3.postOrder() + " = " +  e3.evaluate());
		System.out.println("PreOrder: " + e4.preOrder() + "= " + e4.evaluate());
		System.out.println("InOrder: " + e5.inOrder() + " = " + e5.evaluate());
		System.out.println("PostOrder: " + e6.postOrder() + " = " + e6.evaluate());	
	}

}





