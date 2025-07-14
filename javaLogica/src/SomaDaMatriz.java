public class SomaDaMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
                {2, 3, 1},
                {5, 4, 7},
                {9, 6, 8}
        };

        for (int linha = 0; linha < matriz.length; linha++) {
            int soma = 0;
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                soma += matriz[linha][coluna];
            }
            System.out.println("Soma da linha " + linha + ": " + soma);
        }

    }

}
