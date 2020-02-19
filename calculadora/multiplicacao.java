/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 *Aluno Thais Fernandes
 */
import javax.swing.JOptionPane;
class multiplicacao {
    double resultado;
    void multiplica(double num1, double num2) {
    resultado = num1 * num2;
    JOptionPane.showMessageDialog (null, "the sum is " + resultado, "sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
}
