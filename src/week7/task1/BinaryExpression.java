package week7.task1;
public abstract class BinaryExpression extends Expression{

    @Override
    abstract public int evaluate();
    abstract public Expression left();
    abstract public Expression right();
}
