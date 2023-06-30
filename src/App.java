import java.util.logging.Logger;

import presenter.Presenter;
import test.Crunch;

public class App {
    static Logger appLogger = Logger.getLogger("Application");
    public static void main(String[] args) throws Exception {
        appLogger.info("started");
        Presenter app = new Presenter();
        app.startCalc();
        appLogger.info("ended");
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
