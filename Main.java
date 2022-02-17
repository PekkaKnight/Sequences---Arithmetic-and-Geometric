import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        int[] arr = {3, 6, 12, 24, 48};
        Sequence test  = new Sequence(arr);
        Internal test2 = new Internal(arr);
        test.print();
        if(test.isArithmetic() == true){
            System.out.println("The sequence is " + test.specifySequence() + " and " + "the Common Difference is " + test2.getCommonDifference());
        }
        else if(test.isGeometric() == true){
            System.out.println("The sequence is " + test.specifySequence() + " and " + "the Common Ratio is " + test2.getCommonRatio());
        }
        else{
            System.out.println("Neither Arithmetic or Geometric");
        }
    }

}
