package model;

public abstract class Operator<T extends Operand>{
    protected String textRepresentation;
    public boolean match(String operator) {
        return this.textRepresentation.equals(operator);
    }
    public abstract  T execute(T operandLeft, T operandRight) throws Exception;
}
