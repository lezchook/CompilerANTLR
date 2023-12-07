package ru.leshchenko.itmolabs;

import com.sun.jdi.Value;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class langInterpreterListener extends langBaseListener {
    private Map<String, Integer> variables = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void enterInput(langParser.InputContext ctx) {
        String variableName = ctx.ID().getText();

        System.out.print("Enter a value for " + variableName + ": ");

        try {
            int input = scanner.nextInt();
            variables.put(variableName, input);
        } catch (java.util.InputMismatchException e) {
            System.err.println("Error: Invalid input for variable " + variableName);
            scanner.next(); // Consume invalid input
        }
    }

    @Override
    public void enterAssign(langParser.AssignContext ctx) {
        String variableName = ctx.ID(0).getText();
        String value = ctx.NUM().getText();

        try {
            int numericValue = Integer.parseInt(value);
            variables.put(variableName, numericValue);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid assignment value for variable " + variableName);
        }
    }

    @Override
    public void enterAdd(langParser.AddContext ctx) {
        String variableName = "";
        String value = "";
        try {
            variableName = ctx.ID(1).getText();
            value = ctx.ID(0).getText();
        } catch (Exception e) {
            variableName = ctx.ID(0).getText();
            value = ctx.NUM().getText();
        }

        try {
            int numericValue = Integer.parseInt(value);
            if (variables.containsKey(variableName)) {
                int currentValue = variables.get(variableName);
                variables.put(variableName, currentValue + numericValue);
            } else {
                System.err.println("Error: Variable " + variableName + " is not defined.");
            }
        } catch (NumberFormatException e) {
            if (variables.containsKey(value)) {
                int currentValue = variables.get(variableName);
                int otherValue = variables.get(value);
                variables.put(variableName, currentValue + otherValue);
            } else {
                System.err.println("Error: Variable " + value + " is not defined.");
            }
        }
    }

    @Override
    public void enterSub(langParser.SubContext ctx) {
        String variableName = "";
        String value = "";
        try {
            variableName = ctx.ID(1).getText();
            value = ctx.ID(0).getText();
        } catch (Exception e) {
            variableName = ctx.ID(0).getText();
            value = ctx.NUM().getText();
        }
        try {
            int numericValue = Integer.parseInt(value);
            if (variables.containsKey(variableName)) {
                int currentValue = variables.get(variableName);
                variables.put(variableName, currentValue - numericValue);
            } else {
                System.err.println("Error: Variable " + variableName + " is not defined.");
            }
        } catch (NumberFormatException e) {
            if (variables.containsKey(value)) {
                int currentValue = variables.get(variableName);
                int otherValue = variables.get(value);
                variables.put(variableName, currentValue - otherValue);
            } else {
                System.err.println("Error: Variable " + value + " is not defined.");
            }
        }
    }

    @Override
    public void enterPrint(langParser.PrintContext ctx) {
        String toPrint = ctx.ID() != null ? ctx.ID().getText() : ctx.NUM().getText();
        if (variables.containsKey(toPrint)) {
            int value = variables.get(toPrint);
            System.out.println("Printing: " + value);
        } else {
            try {
                int numericValue = Integer.parseInt(toPrint);
                System.out.println("Printing: " + numericValue);
            } catch (NumberFormatException e) {
                System.err.println("Error: Variable " + toPrint + " is not defined.");
            }
        }
    }

    @Override
    public void enterMul(langParser.MulContext ctx) {
        String variableName = "";
        String value = "";
        try {
            value = ctx.ID(1).getText();
            variableName = ctx.ID(0).getText();
        } catch (Exception e) {
            variableName = ctx.ID(0).getText();
            value = ctx.NUM().getText();
        }
        try {
            int numericValue = Integer.parseInt(value);
            if (variables.containsKey(variableName)) {
                int currentValue = variables.get(variableName);
                variables.put(variableName, currentValue * numericValue);
            } else {
                System.err.println("Error: Variable " + variableName + " is not defined.");
            }
        } catch (NumberFormatException e) {
            if (variables.containsKey(value)) {
                int currentValue = variables.get(variableName);
                int otherValue = variables.get(value);
                variables.put(variableName, currentValue * otherValue);
            } else {
                System.err.println("Error: Variable " + value + " is not defined.");
            }
        }
    }

    @Override
    public void enterDiv(langParser.DivContext ctx) {
        String variableName = "";
        String value = "";
        try {
            value = ctx.ID(1).getText();
            variableName = ctx.ID(0).getText();
        } catch (Exception e) {
            variableName = ctx.ID(0).getText();
            value = ctx.NUM().getText();
        }
        try {
            int numericValue = Integer.parseInt(value);
            if (variables.containsKey(variableName)) {
                int currentValue = variables.get(variableName);
                variables.put(variableName, currentValue / numericValue);
            } else {
                System.err.println("Error: Variable " + variableName + " is not defined.");
            }
        } catch (NumberFormatException e) {
            if (variables.containsKey(value)) {
                int currentValue = variables.get(variableName);
                int otherValue = variables.get(value);
                variables.put(variableName, currentValue / otherValue);
            } else {
                System.err.println("Error: Variable " + value + " is not defined.");
            }
        }
    }

    @Override
    public void enterFactorial(langParser.FactorialContext ctx) {
        String variableName = ctx.ID(0).getText();
        String value = ctx.NUM().getText();

        try {
            int numericValue = Integer.parseInt(value);
            numericValue = getFactorial(numericValue);
            variables.put(variableName, numericValue);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid assignment value for variable " + variableName);
        }
    }

    private int getFactorial(int a) {
        if (a <= 1) {
            return 1;
        }
        else {
            return a * getFactorial(a - 1);
        }
    }

}