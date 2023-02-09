import javax.swing.JOptionPane;

    public class Addition
{
        public static void main ( String[] args )
    {

      String PrimeiroNumero =
         JOptionPane.showInputDialog( " Insira o primeiro numero" );
      String SegundoNumero =
         JOptionPane.showInputDialog( " Insira o segundo numero" );
      String Calculo =
            JOptionPane.showInputDialog( " Digite o tipo de calculo que voce deseja fazer" ); 

      int number1 = Integer.parseInt ( PrimeiroNumero);
      int number2 = Integer.parseInt ( SegundoNumero);

      int Soma = number1 + number2;
      int subtracao = number1 - number2;
      int divisao = number1 / number2;
      int multiplicacao = number1 * number2;

      if (Calculo.equals("+")){
        
            JOptionPane.showMessageDialog( null, " A soma é " + Soma ,  " Soma de dois inteiros " , JOptionPane.INFORMATION_MESSAGE);
    
        }else if (Calculo.equals("-")){
        
            JOptionPane.showMessageDialog( null, " A subtração é " + subtracao ,  " Subtração de dois inteiros " , JOptionPane.INFORMATION_MESSAGE);

        }else if (Calculo.equals("/")){
        
            JOptionPane.showMessageDialog( null, " A divisão é " + divisao ,  " Divisão de dois inteiros " , JOptionPane.INFORMATION_MESSAGE);
       
        }else if (Calculo.equals("*")){
            
            JOptionPane.showMessageDialog( null, " A multiplicação é " + multiplicacao ,  " Multiplicação de dois inteiros " , JOptionPane.INFORMATION_MESSAGE);
      
        }else{   
         JOptionPane.showMessageDialog  (null ,"VOCEE È burro cara", "que locura! ", JOptionPane.ERROR_MESSAGE);
        }
  }

  
}


