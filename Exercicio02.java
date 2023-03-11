import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        /*Faça um programa que solicite que o usuário informe o nome de uma
        disciplina, sua média final e sua porcentagem de frequência. Verifique se ele
        está apto a ser aprovado, de acordo com a regra, que prevê: i) que o estudante
        precisa de média final 7 ou superior e; ii) 75% de frequência ou superior, e
        informe: Ex.: “Com média 8 e frequência 83%, você está aprovado/reprovado na
        unidade curricular de Z*/

String nomeDisciplina;
double mediaFinal,frequencia;

nomeDisciplina = JOptionPane.showInputDialog("Informe a disciplina");
mediaFinal = Double.parseDouble(JOptionPane.showInputDialog("Informe sua média fina na"+ "disciplina "+nomeDisciplina));
frequencia = Double.parseDouble(JOptionPane.showInputDialog("Informe sua frequencia na"+ "disciplina "+nomeDisciplina));

if (mediaFinal>=7 && frequencia>=75){
    JOptionPane.showMessageDialog(null, "Com média "+ mediaFinal+"e frequencia "
    + frequencia+ "%," + "voce esta APROVADO "
    + "na disciplina de"+nomeDisciplina);

}
else {
    JOptionPane.showMessageDialog(null, "Com média "+ mediaFinal+"e frequencia "
    + frequencia+ "%," + "voce esta REPROVADO "
    + "na disciplina de "+nomeDisciplina);      
}



}}