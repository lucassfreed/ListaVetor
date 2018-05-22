import javax.swing.JOptionPane;

public class Ex02 {

    public static void main(String[] args) {
        
        String[] nomes = new String[10];

        nomes[0] = JOptionPane.showInputDialog("Informe o nome");
        nomes[1] = JOptionPane.showInputDialog("Informe o nome");
        nomes[2] = JOptionPane.showInputDialog("Informe o nome");
        nomes[3] = JOptionPane.showInputDialog("Informe o nome");
        nomes[4] = JOptionPane.showInputDialog("Informe o nome");
        nomes[5] = JOptionPane.showInputDialog("Informe o nome");
        nomes[6] = JOptionPane.showInputDialog("Informe o nome");
        nomes[7] = JOptionPane.showInputDialog("Informe o nome");
        nomes[8] = JOptionPane.showInputDialog("Informe o nome");
        nomes[9] = JOptionPane.showInputDialog("Informe o nome");

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        System.out.println(nomes[3]);
        System.out.println(nomes[4]);
        System.out.println(nomes[5]);
        System.out.println(nomes[6]);
        System.out.println(nomes[7]);
        System.out.println(nomes[8]);
        System.out.println(nomes[9]);

    }

}