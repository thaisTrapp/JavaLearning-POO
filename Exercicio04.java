import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        /*FUP que receba um valor de temperatura em ºF (Grau Fahrenheit) e converta
        para ºC (Grau Celsius). Fórmula do cálculo para essa conversão:
        temperaturaC = 5 * (temperaturaF – 32) / 9
        Como resultado, mostre a seguinte mensagem: Ex.: “XXº F equivalem a YYºC*/


        double temperaturaF = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor de temperatura em ºF (Grau Fahrenheit) para converter em ºC (Grau Celsius)"));
        double temperaturaC = (5*(temperaturaF-32))/9;
        JOptionPane.showMessageDialog(null, temperaturaF+"º F equivalem a "+temperaturaC+"ºC");


    }
}
