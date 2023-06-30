package presenter;

import model.AddComplexOperator;
import model.DivComplexOperator;
import model.MulComplexOperator;
import model.Operand;
import model.Operator;
import model.SubComplexOperator;
import service.ComplexOperandService;
import view.ConsoleView;

public class Presenter {
    
    ConsoleView view;
    ComplexOperandService srvc;

    public Presenter() {
        srvc = new ComplexOperandService();
        
        view = new ConsoleView();
    }

    public void startCalc() throws Exception {
        String s1 = view.getValue("Введите первое комплексное число: ");
        String s2 = view.getValue("Введите второе комплексное число: ");
        Operand op1 = srvc.fromString(s1);
        Operand op2 = srvc.fromString(s2);
        //ComplexNumber num2 = new ComplexNumber(r2, i2);
        
        Operator add =  new AddComplexOperator();
        view.print(add.execute(op1, op2), "Сумма: ");
        add =  new SubComplexOperator();
        view.print(add.execute(op1, op2), "Разность: ");
        add =  new MulComplexOperator();
        view.print(add.execute(op1, op2), "Произведение: ");
        add =  new DivComplexOperator();
        view.print(add.execute(op1, op2), "Частное: ");

    }

}
