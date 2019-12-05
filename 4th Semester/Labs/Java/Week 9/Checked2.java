//checked
//ClassNotFoundException
package main.java;
 
public class Checked2 {
 
    private static final String CLASS_TO_LOAD = "main.java.Utils";
 
    public static void main(String[] args) {
        try {
            Class loadedClass = Class.forName(CLASS_TO_LOAD);
            System.out.println("Class " + loadedClass + " found successfully!");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("A ClassNotFoundException was caught: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
