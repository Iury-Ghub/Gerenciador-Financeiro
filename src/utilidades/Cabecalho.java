package utilidades;

public class Cabecalho {
    public Cabecalho(String titulo, int largura) {
        for (int i = 0; i<largura;i++){
            System.out.printf("=");
        }
        System.out.println();

        for (int i = 0; i<largura-titulo.length();i++) {
            if ((largura - titulo.length()) % 2 == 0) {
                if (i < (largura - titulo.length()) / 2) {
                    System.out.printf(" ");
                }
            }
        }
        for (int i = 0; i<largura-titulo.length();i++) {
            if ((largura - titulo.length()) % 2 != 0) {
                if (i > (largura - titulo.length()) / 2) {
                    System.out.printf(" ");
                }
            }
        }
        System.out.println(titulo);

        for (int i = 0; i<largura;i++){
            System.out.printf("=");
        }
        System.out.println();
    }

}
