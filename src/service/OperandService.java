package service;
import model.Operand;

public interface OperandService<T extends Operand> {
    public abstract T fromString(String operand) throws Exception;
}
