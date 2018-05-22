import javax.swing.JOptionPane;

public class Ex05 {

    public static void main(String[] args) {
    
        double pesos[] = new double[5];
        
        pesos[0] = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro peso"));
        pesos[1] = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo peso"));
        pesos[2] = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro peso"));
        pesos[3] = Double.parseDouble(JOptionPane.showInputDialog("Informe o quarto peso"));
        pesos[4] = Double.parseDouble(JOptionPane.showInputDialog("Informe o quinto peso"));

        double somaDosPesos = (pesos[0] + pesos[1] + pesos[2] + pesos[3] + pesos[4]);
        double mediaDosPesos = somaDosPesos /5;

        System.out.println("Soma dos pesos: " + somaDosPesos);
        System.out.println("Média dos pesos: " + mediaDosPesos);


    }
}