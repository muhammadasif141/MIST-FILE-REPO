package JavaBasic;
import java.util.Scanner;
public class JavaOparators {
    public static void main(String[] args) {  
        System.out.println("Hello Java Operators");
        
                                               // Arithmetic Operators                                    
        int x = 20 ,y = 10, sum ;
        sum = x+y;                          //// + , - , * , / , % .
        System.out.println("1. Arithmetic Operators ::::: "+sum);
//        // Example : Arithmetic Operators 
//        System.out.println("The Arithmetic Operators result is "+sum);
//        Scanner input = new Scanner (System.in);
//        int num1,num2,result;
//        System.out.print("Enter your first number ");
//        num1= input.nextInt();
//        System.out.print("Enter your second number ");
//        num2= input.nextInt();
//        result = num1 + num2;
//        System.out.println("The addition is "+result);
//        result = num1 - num2;
//        System.out.println("The substructiont is "+result);
//        result = num1 * num2;
//        System.out.println("The multiplication is "+result);
//        double result1 = (double)num1 / num2;      //convart double data type
//        System.out.println("The divition is "+result1);
//        result = num1 % num2;
//        System.out.println("The modulus is "+result);
        
//        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//                                          //// Unary Operator 
System.out.println("5. Unary Operator :::::");
int x1 = -10,res;
res = -x1;                                  //// unary minus 
System.out.println("The unary minus "+res);
res = +x1;                                  //// unary plus 
System.out.println("The unary plus "+res);
int x2 = 10,y2;
y2 = x2++ ;                                 //// increment : postfix incerment +1 nest x (also use postfix decrement x--)
y2 = x2;
System.out.println( "postfix increment "+y2); 
int x3 = 10,y3;
y3 = ++x3 ;                                 //// increment : prefix incerment +1 instanly (also use postfix decrement --x)
System.out.println("prefix increment "+y3);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                           //// Comparison Operators : Answer True or False Boolean
int x4 = 5, y4 = 3 ;
System.out.println("3. Comparison Operators :::::"+(x4 == y4)); //// == , != , > , < , >= ,<= 

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                           //// Assignment Operators
int x5 = 5;
x5 %= 3;                                  //// = , += , -= , /= , *= , %= , &= , |= , ^= , >>= , <<=  
System.out.println("2. Assignment Operators :::::" +x5);

                                          ////Example : Assignment Operators
//Scanner input1 = new Scanner (System.in);
//double base ,height,area;
//System.out.print("Enter base :");
//base = input1.nextDouble();
//System.out.print("Enter height :");
//height = input1.nextDouble();
//area = 0.5 * base * height;
//System.out.println("Area of triangle "+area);
//
//Scanner input2 = new Scanner (System.in);
//double radius,area1;
//System.out.print("Enter a radious : ");
//radius = input2.nextDouble();
//area1 = 3.1416 *radius*radius;
//System.out.println("Area of cercel "+area1);
//
//Scanner input3 = new Scanner (System.in);
//double cels,farh;
//System.out.print("Enter celcious : ");
//cels = input3.nextDouble();
//farh = 1.8 * cels + 32;
//System.out.println("Farenheit "+farh);
//
//Scanner input4 = new Scanner (System.in);
//System.out.print("Enter Farenheit : ");
//double f = input4.nextDouble();
//double  c =(( 5 *(f - 32.0)) / 9.0);
//System.out.println("celcious  "+c); 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                       //// Logical Operators : Answer True or False Boolean
System.out.println("4. Logical Oparators :::::");                                      
int x6 = 5;
System.out.println(x6 > 3 && x6 < 3);    //// Returns true if both statements are true
System.out.println(x6 > 3 || x6 < 4);      //// Returns true if one of the statements is true
System.out.println(!(x6 > 3 && x6 < 10)); //// Reverse the result, returns false if the result is true
//                                          //// Example : Logical Or ( || )                          
//Scanner input5 = new Scanner (System.in);
//char ch ;
//System.out.print("Enter any letter to check vowel or consonent :");
//ch = input5.next().charAt(0);
//if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
//{
//    System.out.println("This latter is vowel ");
//}
//else{
//    System.out.println("This latter is consonent ");
//}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Scanner input6 = new Scanner (System.in);
//char ch1;
//System.out.print("Enter any one letter ");
//ch1 = input6.next().charAt(0);
//if ( ch1 >= 'a' && ch1 <= 'z'){
//    System.out.println("Small letter ");
//}
//else if (ch1 >= 'A' && ch1 <='Z'){
//    System.out.println("Capital letter ");
//}
//else{
//    System.out.println("You type wrong letter ");
//}                             
//Scanner input7 = new Scanner (System.in);
// int num1,num2,big ;
// System.out.print("Enter tow numbers ");
// num1 = input7.nextInt();
// num2 = input7.nextInt();
//big = (num1>num2) ? num1 : num2;
//        System.out.print("Larger number are "+big);
 }  
}
