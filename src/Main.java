import transacao.TipoTransacao;
import transacao.Transacao;
import utilidades.Cabecalho;

import java.time.LocalDate;
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p;
        TipoTransacao tipo = null;
        int cont = 0;
        Transacao maximo[] = new Transacao[10];



        do{
            new Cabecalho("Gerênciador financero",50);
            System.out.println("Transações :");
            for (Transacao i: maximo){
                if (i != null) {
                    System.out.printf("Descrição : %s\n",i.getDescricao());
                    System.out.printf("Valor : R$ %.2f\n",i.getValor());
                    System.out.printf("Data : %s\n",i.getData());
                    System.out.printf("Tipo : %s\n",i.getTipo());
                }
            }
            if (maximo[0] != null){
                System.out.println("=================================");
            }
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
                        System.out.printf("Tipo :\nR - Receita\nD - Despesa\nOpção : ");
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