package c.exception;

public class ExceptionVariable {
    public static void main(String args[])
    {
        ExceptionVariable exceptionVariable = new ExceptionVariable();
        exceptionVariable.checkVariable3();
    }

    public void checkVariable() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (Exception e){
            System.out.println(intArray.length);
        }
        System.out.println("This code must run.");
    }

    // public void checkVariable2() {
    //     try {
    //         int[] intArray = new int[5];
    //         System.out.println(intArray[5]);
    //     } catch (Exception e){
    //         System.out.println(intArray.length);
    //     }
    //     System.out.println("This code must run.");
    // }

    public void checkVariable3() {
        int[] intArray = null;
        try {
            intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e){
            System.out.println(intArray.length);
        }
        System.out.println("This code must run.");
    }
}
