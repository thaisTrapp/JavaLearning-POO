import javax.swing.JOptionPane;

public class Exercicio09 {
        public static void main(String[] args) {
            /**/
        
            int placa = Integer.parseInt(JOptionPane.showInputDialog("insira o numero final de sua placa"));
            if (placa == 0 || placa == 5){
                JOptionPane.showMessageDialog(null, "Você não pode trafegar nas segundas-feiras");
            }
            if (placa == 1 || placa == 6){
                JOptionPane.showMessageDialog(null, "Você não pode trafegar nas terças-feiras");
            }       
            if (placa == 2 || placa == 7){
                JOptionPane.showMessageDialog(null, "Você não pode trafegar nas quartas-feiras");
            }          
            if (placa == 3 || placa == 8){
                JOptionPane.showMessageDialog(null, "Você não pode trafegar nas quintas-feiras");
            } 
            if (placa == 4 || placa == 9){
                JOptionPane.showMessageDialog(null, "Você não pode trafegar nas sextas-feiras");
            }         
        
        }
}
