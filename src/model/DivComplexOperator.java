package model;

public class DivComplexOperator extends Operator<ComplexOperand> {
    public DivComplexOperator(){
        super();
        super.textRepresentation = "/";
    }

    @Override
    public ComplexOperand execute (ComplexOperand operandLeft, ComplexOperand operandRight) throws Exception {
        if(!operandRight.isZero()){
            int u = operandLeft.getRe();
            int v = operandLeft.getIm();
            int x = operandRight.getRe();
            int y = operandRight.getIm();
            return new ComplexOperand(
                (u*x + v*y)/(x*x + y*y), 
                (v*x - u*y)/(x*x + y*y)
            );
        }
        throw new Exception("Divide by zero");
    }
    
}
