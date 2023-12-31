package service;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.ComplexOperand;

public class ComplexOperandService implements OperandService<ComplexOperand>{
    Logger log = Logger.getAnonymousLogger();
    //Pattern pattern = Pattern.compile("(?<re>\\d)\\ *(?<sign>[+|-])\\ *(?<im>\\d)i");
    Pattern pattern = Pattern.compile("(?<re>-?\\d*)\\ *(?<im>[+|-]?\\ *\\d*)i");
    @Override
    public ComplexOperand fromString (String operand) throws Exception {
        Matcher match = this.pattern.matcher(operand);
        if(match.matches()){
            return new ComplexOperand(
                Integer.parseInt(match.group("re").replace(" ", "")), 
                Integer.parseInt(match.group("im").replace(" ", "")));
        }
        this.log.severe(operand + " is not complex. Raised error...");
        throw new Exception("Not complex operand");        
    }    
}