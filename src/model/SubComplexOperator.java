package model;

public class SubComplexOperator extends Operator<ComplexOperand> {
    public SubComplexOperator(){
        super();
        super.textRepresentation = "-";
    }

    @Override
    public ComplexOperand execute(ComplexOperand operandLeft, ComplexOperand operandRight) {
        return new ComplexOperand(
            operandLeft.getRe()-operandRight.getRe(),
            operandLeft.getIm()-operandRight.getIm()
        );
    }
    
}
