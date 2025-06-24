package Day1;

public class Program03_Addition {
    public static void main(String[] args){
    /*
    Variables
    a,b,c,x,y,z
    a=10
    a+b=20 -> 10+b=20 -> b=10
    Variable represent the type of the value
    Datatype -> Integer -> int a=10;
    b=12.4  -> float b=12.4f;   or      double b=12.4;(Double is most commonly used)
    Numeric Data Types:
    1. byte:     Size: 8 bits   Range: -128 to 127
    2. short:   Size: 16 bits   Range: -32,768 to 32,767
    3. int:     Size: 32 bits   Range: -2,147,483,648 to 2,147,483,647
    4. long:     Size: 32 bits   Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    5. float:    Size: 32 bits  Range: Approximately ±3.40282347E+38F (6-7 decimal digits)
    6. double:  Size: 64 bits   Range: Approximately ±1.79769313486231570E+308 (15-16 decimal digits)
    Character Data Type:
    7. char:   Size: 16 bits   Range: 0 to 65,535 (Unicode characters)
    char='c';       We can also use 1,2,9,a,,c,z,A,G,Z,@,/,l,*) any single character form the keyboard except the function keys
    Char has a capacity of storing single values
    Boolean Data Type:
    8. boolean  Size: Not precisely defined (usually 1 bit)     Values: true or false
    boolean=true;       (true/false)
         */
        //Addition of 2 numbers
        int a=10;
        int b=20;
        int c;
        c=a+b;
        System.out.println("Addition of two numbers are "+c);
    }
}
