package view;

import java.util.Scanner;

import model.Operand;

public class ConsoleView {
    
    Scanner in = new Scanner(System.in);
    public String getValue(String title) {
        
        System.out.printf("%s", title);
        return in.nextLine();
        
    }

    public void print(Operand op, String pre) {
        System.out.println(pre + op);
    }

    
}
