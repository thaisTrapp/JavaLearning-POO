import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {

        /*Faça um programa que pergunte para 20 pessoas o número do candidato que
        elas pretendem votar nessas eleições, considerando a tabela a seguir:
            88 - irineu
            95 - felipe
            23 - jarbas
        Mostre na tela quantas pessoas pretendem votar em cada um dos candidatos,
        e qual o candidato favorito (considere que pode existir empate).
*/
    
int irineu=0,felipe=0,jarbas=0,maisVotado=0;

for (int i = 0; i < 20; i++) {
    int voto = Integer.parseInt(JOptionPane.showInputDialog(
            "Insira o numero do candidato que deseja votar:\n88 - Irineu\n95 - Felipe\n23 - Jarbas"));
    switch (voto) {
        case 88:
            irineu++;
            break;
        case 95:
            felipe++;
            break;
        case 23:
            jarbas++;
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opcao invalida!");
            break;
    }
}

JOptionPane.showMessageDialog(null, "Resultado dos votos:\nIrineu: " + irineu + " votos\nFelipe: " + felipe
        + " votos\nJarbas: " + jarbas + " votos");

maisVotado = Math.max(irineu, Math.max(felipe, jarbas));
if (maisVotado == irineu) {
    JOptionPane.showMessageDialog(null, "Irineu foi o candidato mais votado");
} else if (maisVotado == felipe) {
    JOptionPane.showMessageDialog(null, "Felipe foi o candidato mais votado");
} else if (maisVotado == jarbas) {
    JOptionPane.showMessageDialog(null, "Jarbas foi o candidato mais votado");
} else {
    JOptionPane.showMessageDialog(null, "Houve empate entre os candidatos");
}
}}