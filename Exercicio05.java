import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        /*Faça um programa que receba quatro notas do aluno e as insira em um vetor.
        Depois, calcule a média aritmética entre as quatro notas e mostre o "conceito"
        do aluno conforme as instruções:
        ● 9.0 ou maior = Conceito A
        ● entre 8.0 e 8.9 = Conceito B
        ● entre 7.0 e 7.9 = Conceito C
        ● menor que 7.0 = Conceito D*/

        float notas[] = new float[4];
        int i=0;
        float mediaNotas=0;

        JOptionPane.showMessageDialog(null, "insira quatro para visualizar conceito");
        while(i<4){
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("insira nota "+(i+1)));
                mediaNotas=mediaNotas+notas[i];
            i++;

        }

mediaNotas=mediaNotas/4;
if(mediaNotas >= 9){
    JOptionPane.showMessageDialog(null, "Conceito A");
}
if(mediaNotas >=8 && mediaNotas <9){
    JOptionPane.showMessageDialog(null, "Conceito B");
}
if(mediaNotas >=7 && mediaNotas <8){
    JOptionPane.showMessageDialog(null, "Conceito C");
}
if(mediaNotas < 7){
    JOptionPane.showMessageDialog(null, "Conceito D");
}



    }
}
