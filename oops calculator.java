// Create a public class called Calculator.
public class Calculator {
  // Inside of the class, create a Calculator()constructor
  public Calculator(){

  }
  /*Next, create a public method that returns an int and call it add().
  The add method should add the two integer parameters that a user will specify. Inside of the add method, return the sum of a and b.*/
  public int add(int a, int b){
    return a + b;
  }
  /*Next, create another similar method called subtract(). The subtract() method should accept two int parameters, just like the add() method does.
  Inside of the subtract() method, return the difference of a and b.
  */
  public int subtract(int a, int b){
    return a - b;
  }
  /*Create another method called multiply(). The multiply() method should accept two int parameters
  Inside of the multiply method, return the product of a and b.*/
  public int multiply(int a, int b){
    return a * b;
  }
  
/*Create another method called divide(). It should accept two int parameters.
Inside of the divide() function, return a divided by b*/
  public int divide(int a, int b){
    return a / b;
  }
  /*Create another method called modulo. It should accept two int parameters.

Inside of the modulo() function, return a modulo b.*/
  public int modulo(int a, int b){
    return a % b;
  }
  /* Next, create a main() method.
 Inside of main(), create a Calculator object called myCalculator.*/
  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    // Print out the value of calling the add() method on myCalculator and similarly call other methods also. Pass in 5 and 7 as parameters.
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(5, 7));
    System.out.println(myCalculator.multiply(5, 7));
    System.out.println(myCalculator.divide(5, 7));
    System.out.println(myCalculator.modulo(5, 7));
  }

}