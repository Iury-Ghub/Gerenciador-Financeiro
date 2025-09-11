import transacao.TipoTransacao;
import transacao.Transacao;
import usuario.User;

import java.time.LocalDate;
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p;
        TipoTransacao tipo = null;
        int cont = 0;
        Transacao[] maximo = new Transacao[10];

        do{
            System.out.println("=======Gerenciador Financeiro=======");
            System.out.println("Transações :");

            System.out.printf("Nova transação S/N : ");
            p = scanner.next();
            if (p.equalsIgnoreCase("S")){
                if(cont < 10) {
                    System.out.println("Cadastro de transação :");
                    System.out.printf("Descrição: ");
                    scanner.nextLine();
                    String descricao = scanner.nextLine();
                    System.out.printf("Valor : R$ ");
                    double valor = scanner.nextDouble();
                    LocalDate data = LocalDate.now();
                    String rd;

                    do {
                        System.out.printf(
                                "Tipo :" +
                                        "R - Receita\n" +
                                        "D - Despesa"
                        );
                        rd = scanner.next();
                        if (rd.equalsIgnoreCase("R")) {
                            tipo = TipoTransacao.RECEITA;
                        } else if (rd.equalsIgnoreCase("D")) {
                            tipo = TipoTransacao.DESPESA;
                        } else {
                            System.out.printf("Opção inválida");
                        }
                    } while (!(rd.equalsIgnoreCase("R")|| rd.equalsIgnoreCase("D")));

                    maximo[cont] = new Transacao(descricao,valor,data,tipo);
                    cont++;
                }
            } else if (p.equalsIgnoreCase("N")) {
                System.out.println("Até a proxima");
            }else {
                System.out.println("Digíte uma opção válida");
            }
        }while (!(p.equalsIgnoreCase("N")));

    }
}