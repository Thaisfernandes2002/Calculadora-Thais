package calculadora;
 // Aluna: Thais Fernandes
import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
       // interação do programa com o usúario ao escolher os números
       String operation = JOptionPane.showInputDialog (" which operation do you want to use? ");
       String firstNumber = JOptionPane.showInputDialog(" enter the first number ");
       String secondNumber = JOptionPane.showInputDialog(" enter the second number ");
       int num1 = Integer.parseInt( firstNumber );
       int num2 = Integer.parseInt( secondNumber );
       // escolhas das operações
       int op = Integer.parseInt(operation);
       switch (op){
           case 1:
               adicao adicao = new adicao();
               adicao.adiciona(num1, num2);
               break;
           case 2:
               subtracao subtracao = new subtracao ();
               subtracao.subtrai(num1, num2);
               break;
           case 3:
               multiplicacao multiplicacao = new multiplicacao();
               multiplicacao.multiplica(num1, num2);
               break;
           case 4:          
                divisao divisao = new divisao();
                divisao.divide(num1, num2);
                
       }
    }   
}
