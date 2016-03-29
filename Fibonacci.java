import javax.swing.JOptionPane;
 
/**
 *
 * @author praktikum
 */
public class Fibonacci {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=Integer.parseInt(JOptionPane.showInputDialog("Input: "));
 
        System.out.println("Input: " + n);
 
        for(int i=0; i < n; i++){
            System.out.print("" + a);
            a=a+b;
            b=a-b;
        }
        System.out.println("");
    }
 
}