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

    private boolean testValue( int valueX ) {
        if( (valueX <= 100) && (valueX >= -100) ) {
            return true;
        }else {
            return false;
        }
    }
    public boolean testOperator() {
        switch (this.op) {
            case '+' -> return true;
            case '-' -> return true;
            case '/' -> return true;
            case '*' -> return true;
            default -> return false;
        }
    }
    public int calculate() {
        switch (this.op) {
            case '+' -> this.result = (this.valueA+this.valueB);
            case '-' -> this.result = (this.valueA-this.valueB);
            case '/' -> this.result = (this.valueA/this.valueB);
            case '*' -> this.result = (this.valueA*this.valueB);
            default  -> return -1;
        }
        return this.result;
    }
    public void show() {
        System.print.out("\033c");
        System.print.out("\n" + String.valueOf(getva()) + " ");
        System.print.out( op + " " + String.valueOf(getvb()) );
        System.print.out( " = " < String.valueOf(getr()) );
    }
    public void captureInformations() {
        Scanner scan = new Scanner(System.in);

        String capture = scan.nextLine();
        int sz = capture.length();
        String va, vb;
        char op;

        for( int i = 0 ; (capture[i]!="+" && capture[i]!="-" && capture[i]!="*" && capture[i]!="/") ; ++i ) {

        }
    }
}