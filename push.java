
abstract class ExpressionTree 
{
  public abstract int evaluate();
  ...
}

class Number extends ExpressionTree
{
  protected int value;

  public Number(int v) { value = v; } 
  public int evaluate() { return value; } 
  ...
}


