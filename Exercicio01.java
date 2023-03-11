import javax.swing.JOptionPane;
public class Exercicio01 {

    public static void main(String[] args) {
        /*Faça um programa que peça ao usuário 10 números e mostre posteriormente
quantos são pares e a soma deles, bem como quantos são ímpares e a soma
deles*/

        int numeros[] = new int[10];
        int i=0;
        int somaImpar=0, somaPar = 0;
        int quantidadePar=0,quantidadeImpar=0;

        JOptionPane.showMessageDialog(null, "insira 10 numeros");
        while (i<10) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o número " + (i+1)));
            if (numeros[i]%2 ==0){
                quantidadePar ++;
                somaPar=somaPar+numeros[i];
            }

            if (numeros[i]%2 !=0){
                quantidadeImpar ++;
                somaImpar=somaImpar+numeros[i];
            }
            
            i++;

        }
       
            JOptionPane.showMessageDialog(null, "Quantidade de números pares:" +quantidadePar
            + "\nQuantidade de números impares:" +quantidadeImpar
            +"\nA soma dos números pares é: " +somaPar
            +"\nA soma dos números impares é: " +somaImpar);

}}