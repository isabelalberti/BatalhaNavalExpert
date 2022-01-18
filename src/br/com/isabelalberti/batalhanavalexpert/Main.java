package br.com.isabelalberti.batalhanavalexpert;

import java.util.Scanner;

public class Main {

    static final int
            MAR_SIMBOLO_NAVIO_VAZIO = 0,
            MAR_SIMBOLO_NAVIO_INTEIRO = 1,
            MAR_SIMBOLO_NAVIO_QUEBRADO = 2,
            MAR_SIMBOLO_NAVIO_ERRADO = 3;
    static final char
            MAR_SIMBOLO_VAZIO_CHAR = '~',
            MAR_SIMBOLO_INTEIRO_CHAR = '*',
            MAR_SIMBOLO_QUEBRADO_CHAR = 'X',
            MAR_SIMBOLO_ERRADO_CHAR = 'E';

    public static void main(String[] args) {

        Integer tamanhoMar = 5;
        Integer[][]mar = inicializatabuleiro(tamanhoMar);

        String player1 = lerNomeJogador();
        posicionarbarco();
   }

    public static String lerString(String mensagem){
        Scanner nome = new Scanner(System.in);
        System.out.print(mensagem);
        return nome.nextLine();
    }

    public static void printmar (Integer mar [][]){
        System.out.println(
                "   ║  0 ║ 1 ║ 2 ║ 3 ║ 4 ║\n" +
                        "--- --- --- --- --- ---"
        );

        for (int linha = 0; linha < mar.length; linha++) {
            System.out.print(" " + linha + " ║ ");

            for (int coluna = 0; coluna < mar[linha].length; coluna++) {

                switch (mar[linha][coluna]){
                    case MAR_SIMBOLO_NAVIO_VAZIO:;
                        System.out.print(" " + MAR_SIMBOLO_VAZIO_CHAR + " ║");
                        break;

                    case MAR_SIMBOLO_NAVIO_ERRADO:;
                        System.out.print(" " + MAR_SIMBOLO_ERRADO_CHAR + " ║");
                        break;

                    case MAR_SIMBOLO_NAVIO_INTEIRO:;
                        System.out.print(" " + MAR_SIMBOLO_INTEIRO_CHAR + " ║");
                        break;

                    case MAR_SIMBOLO_NAVIO_QUEBRADO:;
                        System.out.print(" " + MAR_SIMBOLO_QUEBRADO_CHAR + " ║");
                        break;
                }
            }
            System.out.println("\n--- --- --- --- --- ---");
        }
    }

    public static Integer[][] inicializatabuleiro(int tamanhoMar){
        Integer mar [][] = new Integer [tamanhoMar][tamanhoMar];
        for (int linha = 0; linha < mar.length; linha++) {
            for (int coluna = 0; coluna < mar[linha].length; coluna++) {
                mar[linha][coluna] = 0;
            }
        }
        return mar;
    }

    public static String lerNomeJogador(){
        String player1 = lerString("Jogador, digite seu nome: ");
        player1 = player1.trim(); // remove espaço em branco antes e depois inicio da digitação
        return player1.isBlank() ? "Jogador 1" : player1;
    }

    public static void posicionarbarco(){
        // receber posição inicial
        int[]posicao = new int[2];
        boolean deuCertoLeitura = true;

        do {
            String posicaoTemp = lerString(
                    "Digite a posição do seu barco. Separe por vírgula.");
            String[] posicaoTempArray = posicaoTemp.split(",");

            try {
               deuCertoLeitura = true;
                posicao[0] = Integer.parseInt(posicaoTempArray[0].trim());
                posicao[1] = Integer.parseInt(posicaoTempArray[1].trim());
            } catch (Exception erro) {
//            erro.printStackTrace();
                deuCertoLeitura = false;
            }
        }while(!deuCertoLeitura);

        // validar as posições

        // comparar se ja existe barco na posição

        //atribuição das posições
    }
}

