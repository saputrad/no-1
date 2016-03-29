import javax.swing.JOptionPane;
 
/**
 *
 * @author praktikum
 */
public class Fibonacci {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[]args)
 {
  int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai awal Deret Fibonacci"));
  int b = a;
  int c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan deret Fibonacci yang Anda Inginkan: "));
  int d = c-1;
  int e = 1;
  System.out.print(a + " ");
  while(e <=d)
  {
   System.out.print(a +" ");
   a = a+b;
   b = a-b;
   e++;
  }
 }
}
