import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //A PROGRAMAÇÃO ORIENTADA A OBJETOS POSSUI 4 PILARES;
        //HOJE IREMOS APRENDER O PRIMEIRO DELES: ENCAPSULAMENTO
        System.out.println("SISTEMA DE ESTOQUE DE PRODUTOS!");
        Produto produto1 = new Produto();
        produto1.setNome("Arroz");
        produto1.setCodigo(1);
        produto1.setPreco(30);
        produto1.setQtdEstoque(15);

        Scanner teclado = new Scanner(System.in);
        boolean continua = true;
        do{
            System.out.println("Menu:\n1-Exibir dados do produto\n2-Registrar Entrada\n3-Registrar Saída\n4-Alterar preço\n5-Encerrar");
            int menu = teclado.nextInt();
            switch (menu){
                case 1:
                    //DONE - EXIBIR DADOS DO PRODUTO
                    System.out.println(produto1.toString());
                    break;
                case 2:
                    //DONE - REGISTRAR ENTRADA NO ESTOQUE
                    System.out.print("Informe a quantidade de entrada: ");
                    int qtdEntrada = teclado.nextInt();
                    produto1.registrarEntrada(qtdEntrada);
                    break;
                case 3:
                    //DONE - registrar saída do estoque
                    System.out.print("Informe a quantidade de saída: ");
                    int qtdSaida = teclado.nextInt();
                    produto1.registrarSaida(qtdSaida);
                    break;
                case 4:
                    //DONE - ALTERAR PREÇO
                    System.out.print("Informe o novo preço do produto: ");
                    double precoNovo = teclado.nextDouble();
                    produto1.setPreco(precoNovo);
                    break;
                case 5:
                    System.out.println("Encerrando");
                    continua = false; //abandonando o loop
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break; //o default não precisa de break
            }
        }while (continua);

    }
}