import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        /*Faça um programa que leia a idade de uma pessoa e informe a sua classe
        eleitoral: -   (abaixo de 18 anos); Eleitor obrigatório (de 18 a 65 anos);
        Eleitor facultativo (acima de 65 anos).
        */
     int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade para receber classificação eleitoral"));
        if (idade < 18){
            JOptionPane.showMessageDialog(null, "Não eleitor");
        }
        if (idade >= 18 && idade <= 65 ){
            JOptionPane.showMessageDialog(null, "Eleitor obrigatório");
        }
        if (idade > 65){
            JOptionPane.showMessageDialog(null, "Eleitor facultativo");
        }

    
    
    
    
    }
}
