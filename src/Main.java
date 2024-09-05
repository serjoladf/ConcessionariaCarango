import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorVeiculo;
        double valorDesconto = 0;
        double valorComDesconto = 0;
        String opcao;

        System.out.println("Digite o valor do carro");
        valorVeiculo = sc.nextDouble();

        sc.nextLine();

        System.out.println("Digite a opção: Alcool p/ carro a Alcool,  Gasolina p/ carro a Gasolina,,Diesel p/ carro a Diesel");
        opcao = sc.nextLine();
        opcao = opcao.toUpperCase();

        switch (opcao){
            case( "ALCOOL"):
                valorDesconto = 0.25 * valorVeiculo;
                valorComDesconto = (valorVeiculo - valorDesconto);
                break;
            case("GASOLINA"):
                valorDesconto = 0.21*valorVeiculo;
                valorComDesconto =  (valorVeiculo - valorDesconto);
                break;
            case("DIESEL"):
                valorDesconto = 0.14 * valorVeiculo;
                valorComDesconto = (valorVeiculo - valorDesconto);
                break;
            default:
                System.out.println("Opcao inválida");
                break;
        }

        System.out.println("O Cliente recebeu um desconto de " + valorDesconto +" Reais");
        System.out.println("O Cliente pagou no final com desconto "+ valorComDesconto + " Reais");
        sc.close();
    }
}


//EX25. A concessionária de veículos “CARANGO”
//está vendendo os seus veículos com desconto. Faça um algoritmo que
//
//
//calcule e
//exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá
//ser calculado sobre o valor
//
//
//do veículo
//de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). Com
//valor do veículo zero
//
//
//encerra
//entrada de dados. Informe total de desconto e total pago pelos clientes.