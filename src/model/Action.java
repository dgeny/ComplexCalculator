package model;

public interface Action<T extends Operand> {
    public abstract T execute(T operandLeft, T operandRight);
}
