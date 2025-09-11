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
        TipoTransacao tipo;
        int cont = 0;

        do{
            System.out.println("=======Gerenciador Financeiro=======");
            System.out.println("Transações :");
            System.out.printf("Nova transação S/N : ");
            p = scanner.next().toUpperCase();
            if (p == "S"){
                if(cont < 10) {
                    System.out.println("Cadastro de transação :");
                    System.out.printf("Descrição: ");
                    String descricao = scanner.next();
                    System.out.printf("Valor : ");
                    double valor = scanner.nextDouble();
                    LocalDate data = LocalDate.now();
                    String rd;

                    do {
                        System.out.printf(
                                "Tipo :" +
                                        "R - Receita" +
                                        "R - Despesa"
                        );
                        rd = scanner.next().toUpperCase();
                        if (rd == "R") {
                            tipo = TipoTransacao.RECEITA;
                        } else if (rd == "D") {
                            tipo = TipoTransacao.DESPESA;
                        } else {
                            System.out.printf("Opção inválida");
                        }
                    } while (rd != "R" || rd != "D");

                    Transacao[] transacao = new Transacao[10];
                    cont++;
                }
            } else if (p == "N") {
                System.out.println("Até a proxima");
            }else {
                System.out.println("Digíte um número válido");
            }
        }while (p != "N");

    }
}