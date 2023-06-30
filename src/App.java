import presenter.Presenter;
import test.Crunch;

public class App {
    public static void main(String[] args) throws Exception {
        Presenter app = new Presenter();
        app.startCalc();
    }
    /* 
     * +++++++  MODEL ++++++++++++++++++++++
     * class Operand 
     *          >> extends ComplexOperand: realUnit, imaginaryUnit 
     * interface Operation: isThisOps()-------X, Add(), Sub(), Mul(), Div()
     *              >> extends ComplexOperation <ComplexOperand>
     *                  >> extends AddComplex <ComplexOperand>
     *                  ...
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++
     * 
     * ++++++ SERVICE ++++++++++++++++++++++++++++++++++++++
     * interface CalcService: 
     *          >> ComplexCalcService implements ComplexOperation
     *                  >> RecursiveValidate? ...etc
     *          >> ...//real calculate implementation
     * 
     * interface OperandService: parse()
     *          >> ComplexOperandService implements OperandService return ComplexOperand
     * 
     * 
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++
     * 
     *  +++++ CONTROLLER ++++++++++++++++++++++++++++++++++++
     * class Controller(View, Service) parse()...
     *  +++++++++++++++++++++++++++++++++++++++++++++++++++++
     * interface 
     * interface 
     * ++++++ VIEW ++++++++++++++++++++++++++++++++++++++++++++++++
     * interface View
     *              >> extends ConsoleView
     *                      >> input(), parse(), out(), validate()
     *              >> extends ... 
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */

     /* if(Crunch.Test())
           System.out.println("OK!");
        else System.out.println("Not OK!");
        if(Crunch.TestAdd())
            System.out.println("OK!");
        else System.out.println("Not OK!");
        if(Crunch.TestSub())
            System.out.println("OK!");
        else System.out.println("Not OK!");
        if(Crunch.TestMul())
            System.out.println("OK!");
        else System.out.println("Not OK!");
        if(Crunch.TestDiv())
            System.out.println("OK!");
        else System.out.println("Not OK!");
        if(Crunch.TestDivByZero())
            System.out.println("OK!");
        else System.out.println("Not OK!"); */
        
}
