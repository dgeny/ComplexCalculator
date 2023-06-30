package model;

public class ComplexOperand extends Operand {
    private Integer re;// вещественная часть
    
    public Integer getRe() {
        return re;
    }

    private Integer im;// мнимая часть

    public Integer getIm() {
        return im;
    }

    public ComplexOperand(int re, int im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean isZero() {
        return re == 0 && im == 0;
    }

    @Override
    public boolean equals(Object obj) {
        
        return obj instanceof ComplexOperand && 
            this.re == ((ComplexOperand)obj).getRe() &&
            this.im == ((ComplexOperand)obj).getIm();
    }

    @Override
    public String toString() {
        return re + " + " + im +"i";
    }
}
