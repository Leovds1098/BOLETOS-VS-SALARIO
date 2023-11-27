package boletos.vs.salario;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BOLETOSVSSALARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioBruto, salarioLiquido, boleto1, boleto2, boleto3, boleto4, totBoletos;

        System.out.println("Qual o valor bruto do seu salario?");
        salarioBruto = sc.nextDouble();

        System.out.println("Informe o valor do boleto 1: ");
        boleto1 = sc.nextDouble();
        System.out.println("Informe o valor do boleto 2: ");
        boleto2 = sc.nextDouble();
        System.out.println("Informe o valor do boleto 3: ");
        boleto3 = sc.nextDouble();
        System.out.println("Informe o valor do boleto 4: ");
        boleto4 = sc.nextDouble();

        sc.close();

        salarioBruto = salarioBruto - (salarioBruto * 0.125);

        salarioLiquido = salarioBruto - (salarioBruto * 0.06);

        totBoletos = boleto1 + boleto2 + boleto3 + boleto4;

        if (salarioLiquido > totBoletos) {
            System.out.println("Esse mes da pra mandar pra poupança!");
        } else if (salarioLiquido == totBoletos) {
            System.out.println("Esse mes ta de boas");
        } else {
            System.out.println("Esse mes deu ruim!");

        }
    }

}
