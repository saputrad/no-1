import javax.swing.JOptionPane;

public class Fibonacci {
    public static void main(String[] args) {
        int deret=Integer.parseInt(JOptionPane.showInputDialog("Masukkan berapa deret Fibonacci: "));
        int a=0;
        int b=1;
        System.out.print(deret+" deret Fibonacci: " );
        for (int i=0;i<deret;i++){
            System.out.print(a+" ");
            a=a+b;
            b=a-b;   
        }
    }
}
