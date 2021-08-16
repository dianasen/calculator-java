/*
 * written by Diana Sen 
 * this is simple calculator class
 * you will be prompted to enter two numbers 
 * then you will be able to choose operator for your number in order to do calculations 
 */
package calculator;

import java.util.Scanner;

public class calculator {
	char operator;
    Double num1, num2, result;
    int choice;
    
    public void save_numbers() {
    	Scanner input = new Scanner(System.in);

	    System.out.println("Enter first number");
	    num1 = input.nextDouble();

	    System.out.println("Enter second number");
	    num2 = input.nextDouble();
	    
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    input.close();
    }
    
	public void calculator_menu() {
	    switch (operator) {
	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	  }
	 public static void main(String[] args) {
		 calculator myCode = new calculator();
		 myCode.save_numbers();
	     myCode.calculator_menu();
		 
		}
}
