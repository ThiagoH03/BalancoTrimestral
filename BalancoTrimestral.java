//Importações necessárias para o Scanner e o DecimalFormat
import java.text.DecimalFormat;
import java.util.Scanner;

//Desativa as notificações amarelas de "risco"
@SuppressWarnings("resource")

// Primeira parte de um arquivo Java, abrir a class seguindo com o nome do Arquivo
public class BalancoTrimestral {
    
    //Parte principal para começar as linhas de códigos
    public static void main(String[] args) {
    
    //Cria um Scanner, que é usado como um objeto para guardar um valor da próxima String ou do próximo número Inteiro (Foi usado como isso aqui, deve conseguir fazer mais coisa com ele). Pode ser pensado como se fosse um Input
    Scanner meuInputNome = new Scanner(System.in);
    System.out.println("Digite seu nome");

    // É aberto um input aqui em que a varíavel meuNome vai receber o valor dela, o valor a ser entrado será uma String
    String meuNome = meuInputNome.nextLine();
    
    //É possível adicionar variáveis na mesma linha de código com o fechamento das aspas e adição do +
    System.out.println("Seu nome de usuario e " + meuNome + ", seja bem vindo!");
    Scanner inputMes = new Scanner(System.in);

    //Estas duas variáveis são declaradas antes do For para poder ser usadas no futuro, com o valor recebido dentro da estrutura
    float gastoTotal = 0; 
    int gastoMes;
    for (int i = 1; i < 4; i++){
        System.out.println("\nDigite o gasto do "+ i +" mes:");
        gastoMes = inputMes.nextInt();    

        gastoTotal = gastoTotal + gastoMes;
    }
    //Float é usado para ter poucos números nas casas decimais
    float mediaMensal = gastoTotal/3;

    //DecimalFormat é um objeto que é usado para formatar um valor, ele aproveita e transforma o inteiro/float/double numa String, que pode ser usada depois
    DecimalFormat decimalFormatado = new DecimalFormat("#.##");
    String mediaMensalFormatada = decimalFormatado.format(mediaMensal);

    System.out.println("\nEste foi o gasto de 3 meses: R$" + gastoTotal);
    System.out.println("Valor da media mensal = R$" + mediaMensalFormatada);
    }
}
