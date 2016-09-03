package recursionnobasecondition;

/**
 * Throws java.lang.StackOverflowError error
 * @author Adarsh
 */
public class RecursionNoBaseCondition {
    public static void main(String...args){
        recursivecall();
    }

    public static void recursivecall(){
        //just call itself
        recursivecall();
    }
}
