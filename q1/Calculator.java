import java.util.Scanner;

public class Calculator
{
    private int valueA;
    private int valueB;
    private int result;
    private char op;

    //get value a
    public int getva() {
        return this.valueA;
    }
    public int getvb() {
        return this.valueB;
    }
    public int getr() {
        return this.result;
    }
    public void setva( int valueA ) {
        this.valueA = valueA;
    }
    public void setvb( int valueB ) {
        this.valueB = valueB;
    }
    public void setop( char op ) {
        this.op = op;
    }
    public char getop() {
        return this.op;
    }

    private boolean testValue( int valueX ) {
        if( (valueX <= 100) && (valueX >= -100) ) {
            return true;
        }else {
            return false;
        }
    }
    public boolean testOperator() {
        switch (this.op) {
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
        switch (this.op) {
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
        System.out.print("\n" + String.valueOf(getva()) + " ");
        System.out.print( op + " " + String.valueOf(getvb()) );
        System.out.println( " = " + String.valueOf(getr()) );
    }
    public void captureInformations() {
        Scanner scan = new Scanner(System.in);

        String capture = scan.nextLine();
        String[] index = capture.split(" ");

        setva( Integer.parseInt(index[0]) );
        setop( index[1].charAt(0) );
        setvb( Integer.parseInt(index[2]) );
    }
}