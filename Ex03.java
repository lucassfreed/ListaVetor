import javax.swing.JOptionPane;

public class Ex03 {

    public static void main(String[] args) {
        
        String[] nomes = new String[7];
        double[] precos = new double[7];

        int contador = 0;

        while (!(contador == 7)) {

            nomes[contador] = JOptionPane.showInputDialog("Informe o nome do " + (contador + 1) + "º produto");
            precos[contador] = Double.parseDouble(JOptionPane.showInputDialog
            ("Informe o preço do " + (contador + 1) + "º produto"));

            contador++;
        }

        contador = 0;
        while (!(contador == 7)) {
            System.out.println("Nome do " + (contador + 1) + "º produto: " + nomes[contador]);
            System.out.println("Preço do " + (contador + 1) + "º produto: R$ " + precos[contador]);
            System.out.println("");

            contador++;
        }


    }

}