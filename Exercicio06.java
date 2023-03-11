import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        /* Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco. Faça um
        programa que permita ao usuário informar uma quantidade de latão em quilos
        e forneça o total de cobre e zinco necessários para fabricar essa quantidade.
        */

        float latao;

        latao = Float.parseFloat(JOptionPane.showInputDialog("insira a quantidade de latão em quilos para receber o total de cobre e zinco necessários para fabricar essa quantidade "));
        JOptionPane.showMessageDialog(null, "Serão necessários:\n"
                                      +(0.7*latao)+"Kg de cobre\n"
                                      +(0.3*latao)+"Kg de zinco\n"
                                      +"Para fabricar "+latao+"Kgs de latao");
    
    }}
