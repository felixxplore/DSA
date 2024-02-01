/*
The program you provided is a Java implementation of the Newton-Raphson method to find the square root of a given number. Here's a breakdown:

* -> 1. Program Purpose:

   - The program aims to find the square root of a given number using the Newton-Raphson method.
   - It initializes an initial guess (\(x\)), then iteratively refines this guess until it converges to the square root.

* -> 2. Problem Solved:

   - The problem being solved is the calculation of the square root of a number without using built-in functions like `Math.sqrt()`.
   - The Newton-Raphson method is employed to iteratively improve the approximation of the square root until it reaches a satisfactory level of precision.

* -> 3. Concept Explanation:

   - The Newton-Raphson method is an iterative numerical technique used to find the roots of a real-valued function.
   - In this case, the function is \(f(x) = x^2 - N\), where \(N\) is the given number, and \(x\) is the variable representing the square root.
   - The method iteratively refines the guess using the formula \(x_{n+1} = 0.5 \cdot (x_n + \frac{N}{x_n})\).

* -> 4. Why This Concept:

   - The Newton-Raphson method is chosen because it is a relatively efficient and fast way to find the roots of a function.
   - It is commonly used in numerical analysis for solving equations and finding approximations of roots.

* -> 5. Where to Use:

   - This concept and method are useful in scenarios where you need to find roots of equations, and it's especially handy when dealing with functions that don't have straightforward analytical solutions.
   - Applications include numerical analysis, optimization problems, physics simulations, and any situation where an iterative approach to finding roots is required.

Please note that the program uses a while loop with a condition based on the absolute difference between consecutive approximations. This ensures that the iteration continues until the approximation is sufficiently close to the actual square root.


*/

public class newtonRophsonMethod {

  public static void main(String[] args) {
    double n = 40;

    System.out.println(sqrt(n));
  }

  static double sqrt(double n) {
    double x = n;
    double root;

    while (true) {
      root = 0.5 * (x + (n / x));

      if (Math.abs(root - x) < 0.5) {
        break;
      }

      x = root;
    }
    return root;
  }
}
