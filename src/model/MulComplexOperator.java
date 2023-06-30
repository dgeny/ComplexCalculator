package model;

public class MulComplexOperator extends Operator<ComplexOperand> {
    public MulComplexOperator(){
        super();
        super.textRepresentation = "*";
    }

    @Override
    public ComplexOperand execute(ComplexOperand operandLeft, ComplexOperand operandRight) {
        return new ComplexOperand(
            operandLeft.getRe()*operandRight.getRe()-operandRight.getIm()*operandLeft.getIm(),
            operandLeft.getRe()*operandRight.getIm()+operandLeft.getIm()*operandRight.getRe()
        );
    }
    
}