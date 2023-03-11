import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {

        /* Faça um programa que peça os valores de uma matriz 3x3 e ao final, mostre
        na tela o total da soma de todos os elementos dessa matriz. */

        int[][] matriz = new int[3][3];
        int soma = 0;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira valor na matriz, posição: [" + (i+1)+ "][" + (j+1) + "]:"));
                soma += matriz[i][j];
            }
        }

        JOptionPane.showMessageDialog(null, "Soma dos elementos da matriz: " + soma);
    }
}