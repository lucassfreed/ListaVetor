import javax.swing.JOptionPane;

public class Ex04 {

    public static void main(String[] args) {
        
        double[] notas = new double[4];

        String nome = JOptionPane.showInputDialog("Informe o seu nome");

        notas[0] = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
        notas[1] = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
        notas[2] = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));
        notas[3] = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota"));

        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.println("Média das notas: " + media);

    }

}