import java.util.Scanner;

public class Calculator
{
    private int valueA;
    private int valueB;
    private char op;

    //get value a
    public int getva() {
        return this.valueA;
    }
    public int getvb() {
        return this.valueB;
    }
    public void setva( int valueA ) {
        this.valueA = valueA;
    }
    public void setvb( int valueB ) {
        this.valueB = valueB;
    }

    private testValue( int valueX );
    public boolean testOperator();
    public int calculate();
    public void show();
    public void captureInformations();
}