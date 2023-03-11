import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {
        /*Faça um programa que peça três números e diga qual o maior entre os três.*/

        int numeros[] = new int[3];
        int maiorNumero=0, i =0; 

        while (i<3){

            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("insira 3 números para identificar o maior deles"));
            if (i==0){
                maiorNumero=numeros[i];
            }
            if (numeros[i]>maiorNumero){
                maiorNumero=numeros[i];
            }
                i++;
        }

        JOptionPane.showMessageDialog(null, "O maior número entre eles é "+maiorNumero);



}}
