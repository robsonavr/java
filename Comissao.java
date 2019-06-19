import java.util.Scanner;

public class Comissao {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        String vendedor;
        Double salario, vendas;
        Double comissao, salarioTotal;

        System.out.println("Digite o nome do vendedor: ");
        vendedor  = teclado.nextLine();
        System.out.println("Digite o valor do salario: ");
        salario = teclado.nextDouble();
        System.out.println("Digite o valor das vendas ");
        vendas = teclado.nextDouble();

        System.out.println("Nome: " + vendedor + " salario: " + salario + " Vendas: " + vendas);

        comissao = vendas * 15/100;
        salarioTotal = comissao + salario;

        System.out.printf("Comissao: R$ %.2f Salario total: R$ %.2f\n", comissao, salarioTotal);


    }
}