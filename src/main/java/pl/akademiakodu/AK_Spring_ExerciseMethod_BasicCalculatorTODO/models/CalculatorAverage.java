package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models;
import org.springframework.stereotype.Service;
@Service
public class CalculatorAverage {
    /**
     * Method calculate mathematical square of digit
     * @param a user input
     * @return square of a
     */
    public int squareOf(int a){
        return a * a;
    }
    /**
     * Method calculate mathematical element of digit
     * @param a user input
     * @return element of a
     */
    public int elementOf(int a){
        int result = 1;
        return (int)Math.sqrt(a);
    }
    /**
     * Method calculate mathematical factorial of digit
     * @param a user input
     * @return factorial of a
     */
    public int factorial(int a){
        int sum = 1;
        for (int i = 1; i <=a; i++) {
            sum*=i;

        }
        return sum;
    }
    /**
     * Method check if digit is a prime number
     * @param a user input
     * @return result
     */
    public boolean isPrimeNumber(int a){
        boolean isPrime = true;
        for (int i = 2; i <a ; i++) {
            if (a%i ==0)
                return false;


        }
        return true;
    }
}