package presenter;

import java.util.logging.Logger;

import model.AddComplexOperator;
import model.DivComplexOperator;
import model.MulComplexOperator;
import model.Operand;
import model.Operator;
import model.SubComplexOperator;
import service.ComplexOperandService;
import view.ConsoleView;

public class Presenter {
    Logger log = Logger.getAnonymousLogger();
    ConsoleView view;
    ComplexOperandService srvc;

    public Presenter() {
        srvc = new ComplexOperandService();
        
        view = new ConsoleView();
    }

    public void startCalc() throws Exception {
        log.info("Entering values");
        String s1 = view.getValue("Введите первое комплексное число: ");
        String s2 = view.getValue("Введите второе комплексное число: ");
        log.info("Parsing values");
        Operand op1 = srvc.fromString(s1);
        Operand op2 = srvc.fromString(s2);
        //ComplexNumber num2 = new ComplexNumber(r2, i2);
        log.info("Addition of complex numbers started");
        Operator add =  new AddComplexOperator();
        view.print(add.execute(op1, op2), "Сумма: ");
        log.info("Substraction of complex numbers started");
        add =  new SubComplexOperator();
        view.print(add.execute(op1, op2), "Разность: ");
        log.info("Multiplication of complex numbers started");
        add =  new MulComplexOperator();
        view.print(add.execute(op1, op2), "Произведение: ");
        log.info("Division of complex numbers started");
        add =  new DivComplexOperator();
        view.print(add.execute(op1, op2), "Частное: ");

    }

}
