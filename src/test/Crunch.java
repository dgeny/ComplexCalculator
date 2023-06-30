package test;

import model.AddComplexOperator;
import model.ComplexOperand;
import model.DivComplexOperator;
import model.MulComplexOperator;
import model.Operator;
import model.SubComplexOperator;
import service.ComplexOperandService;

public class Crunch {
    public static boolean Test() throws Exception{
        ComplexOperandService srvc = new ComplexOperandService();
        if(srvc.fromString("1+1i") instanceof ComplexOperand &&
            srvc.fromString("1   - 1i") instanceof ComplexOperand &&
            !(srvc.fromString("2") instanceof ComplexOperand))
            return true;
        
        return false;
    }

    public static boolean TestAdd() throws Exception{
        ComplexOperandService srvc = new ComplexOperandService();
        AddComplexOperator add =  new AddComplexOperator();
        if(add.execute(srvc.fromString("1+1i"), srvc.fromString("1+1i")).equals(
            srvc.fromString("2+2i")
        ))
            return true;        
        return false;
    }

    public static boolean TestSub() throws Exception {
        ComplexOperandService srvc = new ComplexOperandService();
        Operator<ComplexOperand> sub =  new SubComplexOperator();
        if(sub.execute(srvc.fromString("1+1i"), srvc.fromString("1+1i")).isZero())
            return true;        
        return false;
    }

    public static boolean TestMul() throws Exception{
        ComplexOperandService srvc = new ComplexOperandService();
        Operator<ComplexOperand> sub =  new MulComplexOperator();
        ComplexOperand op1 =srvc.fromString("3 - 2i");
        ComplexOperand op2 =srvc.fromString("-4+3i");
        if(sub.execute(op1, op2).equals(
            srvc.fromString("-6 + 17i")
        ) )
            return true;        
        return false;
    }

    public static boolean TestDiv() throws Exception{
        ComplexOperandService srvc = new ComplexOperandService();
        Operator<ComplexOperand> sub =  new DivComplexOperator();
        ComplexOperand op1 =srvc.fromString("1 + 1i");
        ComplexOperand op2 =srvc.fromString("1+1i");
        if(sub.execute(op1, op2).equals(
            srvc.fromString("1 + 0i")
        ) )
            return true;        
        return false;
    }

    public static boolean TestDivByZero() throws Exception{
        ComplexOperandService srvc = new ComplexOperandService();
        Operator<ComplexOperand> sub =  new DivComplexOperator();
        ComplexOperand op1 =srvc.fromString("1 + 1i");
        ComplexOperand op2 =srvc.fromString("0+0i");
        if(sub.execute(op1, op2).equals(
            srvc.fromString("1 + 0i")
        ) )
            return true;   
        return false;
    }
}
