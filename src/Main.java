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
        ArrayList<Transacao> transacoes= new ArrayList<>();



        do{
            new Cabecalho("Gerênciador financero",50);
            System.out.println();
            if (!transacoes.isEmpty()) {
                new Cabecalho("Transacoes",50);
                for (Transacao i: transacoes){
                    System.out.printf("\nDescrição : %s\n",i.getDescricao());
                    System.out.printf("Valor : R$ %.2f\n",i.getValor());
                    System.out.printf("Data : %s\n",i.getData());
                    System.out.printf("Tipo : %s\n",i.getTipo());
            }
                System.out.println();
            }
            System.out.print("Nova transação S/N : ");
            p = scanner.next();

            if (p.equalsIgnoreCase("S")){
                new Cabecalho("Cadastro de transação",50);
                System.out.print("\nDescrição: ");
                scanner.nextLine();
                String descricao = scanner.nextLine();
                System.out.print("Valor : R$ ");
                double valor = scanner.nextDouble();
                LocalDate data = LocalDate.now();
                String rd;

                do {
                    System.out.print("Tipo :\nR - Receita\nD - Despesa\nOpção : ");
                    rd = scanner.next();

                    if (rd.equalsIgnoreCase("R")) {
                        tipo = TipoTransacao.RECEITA;

                    } else if (rd.equalsIgnoreCase("D")) {
                        tipo = TipoTransacao.DESPESA;

                    } else {
                        System.out.print("Opção inválida");
                    }

                } while (!(rd.equalsIgnoreCase("R")|| rd.equalsIgnoreCase("D")));
                transacoes.add(new Transacao(descricao,valor,data,tipo));

            } else if (p.equalsIgnoreCase("N")) {
                System.out.println("Até a proxima");
            }else {
                System.out.println("Digíte uma opção válida");
            }
        }while (!(p.equalsIgnoreCase("N")));
        scanner.close();
    }
}