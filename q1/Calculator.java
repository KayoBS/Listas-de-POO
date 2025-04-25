import java.util.Scanner;

public class Calculator
{
    private int valueA;
    private int valueB;
    private int result;
    private char operand;

    //get value a
    public int getValueA() {
        return this.valueA;
    }
    public int getValueB() {
        return this.valueB;
    }
    public int getResult() {
        return this.result;
    }
    public void setValueA( int valueA ) {
        this.valueA = valueA;
    }
    public void setValueB( int valueB ) {
        this.valueB = valueB;
    }
    public void setOperand( char operand ) {
        this.operand = operand;
    }
    public char getOperand() {
        return this.operand;
    }

    private boolean testValue( int valueX ) {
        if( (valueX <= 100) && (valueX >= -100) ) {
            return true;
        }else {
            return false;
        }
    }
    public boolean testOperator() {
        switch (this.operand) {
            case '+':
                return true;
            case '-':
                return true;
            case '/':
                return true;
            case '*':
                return true;
            default:
                return false;
        }
    }
    public int calculate() {
        switch (this.operand) {
            case '+':
                this.result = (this.valueA+this.valueB);
                break;
            case '-':
                this.result = (this.valueA-this.valueB);
                break;
            case '/':
                this.result = (this.valueA/this.valueB);
                break;
            case '*':
                this.result = (this.valueA*this.valueB);
                break;
            default:
                return -1;
        }
        return this.result;
    }
    public void show() {
        System.out.print("\033c");
        System.out.print("\n" + String.valueOf(getValueA()) + " ");
        System.out.print( operand + " " + String.valueOf(getValueB()) );
        System.out.println( " = " + String.valueOf(getResult()) );
    }
    public void captureInformations() {
        Scanner scan = new Scanner(System.in);
        boolean isCorrect = false;

        while (!isCorrect)
        {
            String capture = scan.nextLine();
            String[] index = capture.split(" ");

            setValueA( Integer.parseInt(index[0]) );
            setOperand( index[1].charAt(0) );
            setValueB( Integer.parseInt(index[2]) );

            isCorrect = this.testOperator();
            if(isCorrect)
            {
                if( this.testValue(getValueA()) && this.testValue(getValueB()))
                {
                    this.calculate();
                    this.show();
                }
            }
        }
    }
}