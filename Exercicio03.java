import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        /*Faça um programa que alimente um vetor com 10 valores inteiros e também
        que solicite ao usuário a entrada de dados de um valor inteiro qualquer. A
        solução deverá fazer uma busca do valor, informado pelo usuário, no vetor e
        imprimir a posição em que esse número foi encontrado ou se não foi
        encontrado.
        */

int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
int a=0, i=0;
int buscaNumero = Integer.parseInt(JOptionPane.showInputDialog("entre com um valor inteiro"));

for(i=0;i<10;i++){
    if(buscaNumero == vetor[i]){
        JOptionPane.showMessageDialog(null, "O valor "+buscaNumero +" encontra-se na posição "+(i+1));
        a++;
    }
}

if (a == 0) {
    JOptionPane.showMessageDialog(null, "Valor "+buscaNumero+" não foi encontrado no vetor");

}

}
}
