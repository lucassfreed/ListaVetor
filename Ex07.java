import javax.swing.JOptionPane;

public class Ex07 {

    public static void main(String[] args) {
    
        double[] alturas = new double[4];

        alturas[0] = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeira altura"));
        alturas[1] = Double.parseDouble(JOptionPane.showInputDialog("Informe o segunda altura"));
        alturas[2] = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceira altura"));
        alturas[3] = Double.parseDouble(JOptionPane.showInputDialog("Informe o quarta altura"));

        double maiorAltura = Double.MIN_VALUE;

        if (alturas[0] > maiorAltura) {
            maiorAltura = alturas[0];
        }
        
        if (alturas[1] > maiorAltura) {
            maiorAltura = alturas[1];
        }
        
        if (alturas[2] > maiorAltura) {
            maiorAltura = alturas[2];
        }
        
        if (alturas[3] > maiorAltura) {
            maiorAltura = alturas[3];
        }
        
        if (alturas[4] > maiorAltura) {
            maiorAltura = alturas[4];
        }
        
        if (alturas[5] > maiorAltura) {
            maiorAltura = alturas[5];
        }
        
        if (alturas[6] > maiorAltura) {
            maiorAltura = alturas[6];
        }
        
        if (alturas[7] > maiorAltura) {
            maiorAltura = alturas[7];
        }
        
        if (alturas[8] > maiorAltura) {
            maiorAltura = alturas[8];
        }

        System.out.println("Maior altura: " + maiorAltura);

    }
}