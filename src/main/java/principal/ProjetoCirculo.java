package principal;

import model.Circulo;
import javax.swing.JOptionPane;


public class ProjetoCirculo {

    public static void main(String[] args) {
        
        Circulo circ = new Circulo();
        
        circ.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo: ")));
        JOptionPane.showMessageDialog(null,"A circunferência é: "+ circ.getCircunferencia());
        JOptionPane.showMessageDialog(null,"A área é: " + circ.getArea());
        
    }
}
